package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.frogbanchan.domain.Comments;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class JoinPartyController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("/party/join.do")
//	public ModelAndView handleRequest(
//			@RequestParam("comment") Comments comment
//		) throws Exception {
//		this.frogbanchan.insertComments(comment);
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("partyInfo");
//		mav.addObject("comment", comment);
//		
//		return mav;
//	}

}