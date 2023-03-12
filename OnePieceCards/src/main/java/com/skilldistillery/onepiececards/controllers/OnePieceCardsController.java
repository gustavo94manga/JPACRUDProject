package com.skilldistillery.onepiececards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.onepiececards.data.OnePieceCardDAO;
import com.skilldistillery.onepiececards.entities.OnePieceCard;

@Controller
public class OnePieceCardsController {

	@Autowired
	private OnePieceCardDAO opcDao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("cards", opcDao.findAll());
		return "home";
	}
	
	@RequestMapping(path="getCard.do")
	public String getCard(Integer opcId, Model model) {
		OnePieceCard card = opcDao.findById(opcId);
		model.addAttribute("display", card);
		return "displaycard";
	}
	@RequestMapping(path="getAllCards.do")
	public String getAllCards(Model model) {
		model.addAttribute("displayAll", opcDao.findAll());
		return "displayallcards";
	}
	
	
	@RequestMapping(path= {"updateCard.do"})
	public String updateCardPage(Model model, Integer cardId, OnePieceCard opc) {
		
//		OnePieceCard card = opcDao.findById(cardId);
		
		model.addAttribute("updateWith", opc);
//		model.addAttribute("cards", card);
//		model.addAttribute(card);
		return "updatecardform";
	}
	
	@RequestMapping(path="updatedCard.do", method=RequestMethod.POST)
	public String updateCard(Integer cardId, Model model, OnePieceCard opc) {
		OnePieceCard card = opcDao.updateCard(cardId, opc);
		
		model.addAttribute(card);
		return "updatedcard";
		
	}
	
	@RequestMapping(path="createCard.do")
	public String createCard(Model model, OnePieceCard opc) {

		model.addAttribute("createWith", opc);
		return "createcard";
	}
	@RequestMapping(path="createdCard.do")
	public String createdCard(Model model, OnePieceCard opc) {

		model.addAttribute("createWith", opc);
		return "createdcard";
	}
	
	@RequestMapping(path="deleteCard.do")
	public String deleteCardPage(Integer cardId, Model model) {
//		model.addAttribute("deleteWith", cardId);
		return "deletecard";
	}
	@RequestMapping(path="deletedCard.do", method=RequestMethod.POST)
	public String deleteCardById( Model model, OnePieceCard opc) {
		OnePieceCard card = opcDao.findById(opc.getId());
		boolean deleted = opcDao.deleteCardById(opc.getId());
		if(deleted) {
			model.addAttribute("deleteWith",deleted);
		} else {
			
		}
		model.addAttribute("deleteWith", deleted);
		
		return "deletedcard";
	}
	
	
}
