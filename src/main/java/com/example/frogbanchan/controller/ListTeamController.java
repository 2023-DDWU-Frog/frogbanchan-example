package com.example.frogbanchan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.frogbanchan.domain.Team;
import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class ListTeamController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("/team/list.do")
//	public String handleRequest(
//			@RequestParam("username") String username,
//			ModelMap model) throws Exception {
//		List<Team> teamList = new ArrayList<Team>(this.frogbanchan.findTeamList(username));
//		Member member = this.frogbanchan.getMember(username);
//		model.put("teamList", teamList);
//		model.put("member", member);
//		return "Team";
//	}
}