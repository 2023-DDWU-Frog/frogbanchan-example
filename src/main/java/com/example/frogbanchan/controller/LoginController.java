package com.example.frogbanchan.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.frogbanchan.domain.Member;
import com.example.frogbanchan.service.FrogBanchanFacade;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

@Controller
@SessionAttributes("userSession")
public class LoginController { 

	private FrogBanchanFacade frogBanchan;
	@Autowired
	public void setFrogBanchan(FrogBanchanFacade frogBanchan) {
		this.frogBanchan = frogBanchan;
	}

//	@RequestMapping("/member/login.do")
//	public ModelAndView handleRequest(HttpServletRequest request,
//			@RequestParam("username") String username,
//			@RequestParam("password") String password,
//			@RequestParam(value="forwardAction", required=false) String forwardAction,
//			Model model) throws Exception {
//		Member member = frogBanchan.findMemberByUsername(username);
//		if (member == null) {
//			return new ModelAndView("Error", "message", 
//					"Invalid username or password.  Signon failed.");
//		}
//		else {
//			UserSession userSession = new UserSession(member);
//			model.addAttribute("userSession", userSession);
//			model.addAttribute("member", member);
//			if (forwardAction != null) 
//				return new ModelAndView("redirect:" + forwardAction);
//			else 
//				return new ModelAndView("index");
//		}
//	}
}