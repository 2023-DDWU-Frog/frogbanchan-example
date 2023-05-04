package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.frogbanchan.domain.Team;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class ViewTeamController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

	@RequestMapping("/team/view.do")
	public String handleRequest(
			@RequestParam("teamId") int teamId,
			ModelMap model) throws Exception {
		Team team = this.frogbanchan.findTeam(teamId);
		model.put("team", team);
		return "Team";
	}
}