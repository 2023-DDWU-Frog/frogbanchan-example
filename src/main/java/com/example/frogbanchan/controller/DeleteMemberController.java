package com.example.frogbanchan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
public class DeleteMemberController { 

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

	@RequestMapping("/member/delete.do")
	public String handleRequest(
			@RequestParam("username") String username, 
			@ModelAttribute("userList") List<String> userList,
			ModelMap model
		) throws Exception {
		
		frogbanchan.deleteMember(username);
		model.put("userList", userList);
		
		return "UserList";
		
	}

}