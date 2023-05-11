package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.frogbanchan.domain.Place;
import com.example.frogbanchan.service.FrogBanchanFacade;

//servlet-context.xml 파일에 
//<context:component-scan base-package="패키지이름" /> 추가

//github desktop testttt 0504 1431
@Controller
public class RegisterPlaceController {

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

// @RequestMapping("/place/register.do")
//	public ModelAndView handleRequest(
//			@RequestParam("placeId") String placeId,
//			@RequestParam("password") String password,
//			@RequestParam("name") String name,
//			@RequestParam("address") String address) {
//	
//		this.frogbanchan.insertPlace(placeId, password, name, address);	
//		
//		return new ModelAndView("place");
//  }

}


