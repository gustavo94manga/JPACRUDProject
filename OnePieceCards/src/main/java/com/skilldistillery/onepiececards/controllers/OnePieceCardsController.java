package com.skilldistillery.onepiececards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
}
