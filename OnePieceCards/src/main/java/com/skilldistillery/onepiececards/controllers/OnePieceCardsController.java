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
	public String updateCard(Integer id, Model model, OnePieceCard opc) {
//		System.err.println("*************** " + id);
		OnePieceCard card = opcDao.updateCard(id, opc);
		model.addAttribute("updateWith", card);
		return "updatedcard";
		
	}
	
	@RequestMapping(path="createCard.do")
	public String createCard(Model model, OnePieceCard opc) {

		model.addAttribute("createWith", opc);
		return "createcard";
	}
	@RequestMapping(path="createdCard.do")
	public String createdCard(Model model, OnePieceCard opc) {
		OnePieceCard newCard = opcDao.createCard(opc);
		model.addAttribute("createWith", newCard);
		return "createdcard";
	}
	
	@RequestMapping(path="deleteCard.do")
	public String deleteCardPage(Integer cardId, Model model) {
		return "deletecard";
	}
	@RequestMapping(path="deletedCard.do",method = RequestMethod.POST)
	public String deleteRecipe(Model model,OnePieceCard card) {
		OnePieceCard opc = opcDao.findById(card.getId());
		boolean deleted = opcDao.deleteCardById(card.getId());
		if (deleted) {
			model.addAttribute("deleteWith",opc.getName()  + " Card Deleted.");
		}else {
			model.addAttribute("deleteWith","Could Not Delete the Card: "+ opc.getName());
	
		}
		return "deletedcard";
	}
}
