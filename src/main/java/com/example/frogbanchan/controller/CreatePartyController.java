package com.example.frogbanchan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.example.frogbanchan.domain.Party;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class CreatePartyController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("partyForm")
//	public PartyForm createTeamForm() {
//		return new PartyForm();
//	}
//	
//	@RequestMapping("party/create.do")
//	public String handleRequest(HttpServletRequest request,
//			@ModelAttribute("partyForm") PartyForm partyForm) {
//		frogbanchan.insertParty(partyForm.getParty());
//		ModelAndView mav = new ModelAndView("ViewParty");
//		mav.addObject("party", partyForm.getParty());
//		mav.addObject("message", "your party has been created.");
//		return mav;
//	}
}