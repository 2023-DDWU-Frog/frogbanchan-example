package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.frogbanchan.domain.Party;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class DeletePartyController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("party/delete.do")
//	public ModelAndView deleteParty(int partyId) {
//		frogbanchan.deleteParty(partyId);
//		
//		return partyList();
//	}
}