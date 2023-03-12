package com.skilldistillery.onepiececards.data;

import java.util.List;

import com.skilldistillery.onepiececards.entities.OnePieceCard;

public interface OnePieceCardDAO {
	OnePieceCard findById(int cardId);
	List<OnePieceCard> findAll();
	OnePieceCard createCard(OnePieceCard opc);
//	OnePieceCard update(int cardId);
	boolean deleteCardById(int cardId);
	OnePieceCard updateCard(Integer cardId, OnePieceCard opc);
	
}
