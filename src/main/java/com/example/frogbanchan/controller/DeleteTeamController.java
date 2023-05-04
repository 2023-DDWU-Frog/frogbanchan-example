package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.frogbanchan.domain.Team;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class DeleteTeamController { 

	private FrogBanchanFacade frogbanchan;
	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("team/delete.do")
//	public ModelAndView deleteTeam(int teamId) {
//		frogbanchan.deleteTeam(teamId);
//		
//		return teamList();
//	}
}