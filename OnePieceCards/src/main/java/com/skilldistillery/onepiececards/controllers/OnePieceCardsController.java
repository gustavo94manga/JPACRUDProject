package com.skilldistillery.onepiececards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.onepiececards.data.OnePieceCardDAO;

@Controller
public class OnePieceCardsController {

	@Autowired
	private OnePieceCardDAO opcDao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("cards", opcDao.findAll());
		return "home";
	}
	
	
}
