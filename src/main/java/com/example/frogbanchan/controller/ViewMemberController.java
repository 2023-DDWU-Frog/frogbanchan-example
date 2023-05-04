package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class ViewMemberController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

	@RequestMapping("/member/view.do")
	public ModelAndView handleRequest(
			@RequestParam("username") String username
			) throws Exception {

		Member member = this.frogbanchan.findMemberByUsername(username);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("myPageForCommon");
		mav.addObject("member", member);
		
		return mav;
	}

}