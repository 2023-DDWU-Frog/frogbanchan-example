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

import com.example.frogbanchan.domain.Team;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class CreateTeamController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("teamForm")
//	public TeamForm createTeamForm() {
//		return new TeamForm();
//	}
//	
//	@RequestMapping("team/create.do")
//	public String handleRequest(HttpServletRequest request,
//			@ModelAttribute("teamForm") TeamForm teamForm) {
//		frogbanchan.insertTeam(teamForm.getTeam());
//		ModelAndView mav = new ModelAndView("ViewTeam");
//		mav.addObject("team", teamForm.getTeam());
//		mav.addObject("message", "your team has been created.");
//		return mav;
//	}
}
