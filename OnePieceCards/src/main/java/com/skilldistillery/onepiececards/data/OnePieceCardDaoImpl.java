package com.skilldistillery.onepiececards.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.onepiececards.entities.OnePieceCard;

@Service
@Transactional
public class OnePieceCardDaoImpl implements OnePieceCardDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public OnePieceCard findById(int cardId) {
		return em.find(OnePieceCard.class, cardId);
	}

	@Override
	public List<OnePieceCard> findAll() {
		String jpql = "SELECT card FROM OnePieceCard card";
		return em.createQuery(jpql, OnePieceCard.class).getResultList();
	}

	//REMINDER:
//	NO begin/commit
//	NO em.close();
	
	@Override
	public OnePieceCard createCard(OnePieceCard opc) {
		
		
		OnePieceCard card = new OnePieceCard();
		
		card.setName(opc.getName());
		card.setLastName(opc.getLastName());
		card.setDescription(opc.getDescription());
		card.setCardType(opc.getCardType());
		card.setAttribute(opc.getAttribute());
		card.setDon(opc.getDon());
		card.setPowerLevel(opc.getPowerLevel());
		card.setPrice(opc.getPrice());
		card.setCardBox(opc.getCardBox());
		card.setColor(opc.getColor());
		card.setRarity(opc.getRarity());
		em.persist(card);
		return card;
	}
	@Override
	public OnePieceCard updateCard(Integer cardId, OnePieceCard opc) {
		OnePieceCard updatedOPC = em.find(OnePieceCard.class, cardId);

		
		updatedOPC.setName(opc.getName());
		updatedOPC.setLastName(opc.getLastName());
		updatedOPC.setDescription(opc.getDescription());
		updatedOPC.setCardType(opc.getCardType());
		updatedOPC.setPowerLevel(opc.getPowerLevel());
		updatedOPC.setAttribute(opc.getAttribute());
		updatedOPC.setDon(opc.getDon());
		updatedOPC.setColor(opc.getColor());
		updatedOPC.setPrice(opc.getPrice());
		updatedOPC.setRarity(opc.getRarity());
		updatedOPC.setCardBox(opc.getCardBox());

		return updatedOPC;
	}

	@Override
	public boolean deleteCardById(int cardId) {
		boolean deleted = false;
		
		OnePieceCard card = em.find(OnePieceCard.class, cardId);
		if(card != null) {
			em.remove(card);
			deleted = true;
		}
		
		return deleted;
	}

}
