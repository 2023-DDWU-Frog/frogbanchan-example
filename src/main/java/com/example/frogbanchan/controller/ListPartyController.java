package com.example.frogbanchan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.frogbanchan.domain.Party;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class ListPartyController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

	@RequestMapping("/party/list.do")
	public String handleRequest(ModelMap model)
					 throws Exception {
		List<Party> partyList = new ArrayList<Party>(this.frogbanchan.findPartyList());
		model.put("partyList", partyList);
		return "Party";
	}
}