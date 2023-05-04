package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.frogbanchan.domain.Party;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class ViewPartyController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

	@RequestMapping("/party/view.do")
	public String handleRequest(
			@RequestParam("partyId") int partyId,
			ModelMap model) throws Exception {
		Party party = this.frogbanchan.findParty(partyId);
		model.put("party", party);
		return "Party";
	}
}