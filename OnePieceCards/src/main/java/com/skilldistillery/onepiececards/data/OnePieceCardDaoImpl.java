package com.skilldistillery.onepiececards.data;

import java.util.List;

import javax.persistence.EntityManager;
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
	public OnePieceCard create(OnePieceCard opc) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public OnePieceCard update(int cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int cardId) {
		// TODO Auto-generated method stub
		return false;
	}

}
