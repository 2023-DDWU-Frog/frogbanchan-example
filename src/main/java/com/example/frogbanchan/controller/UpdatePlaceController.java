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

@Controller
public class UpdatePlaceController {

	private FrogBanchanFacade frogbanchan;

	@Autowired
	public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
		this.frogbanchan = frogbanchan;
	}

//	@RequestMapping("/place/update.do")
//	public ModelAndView handleRequest(
//			@RequestParam("placeId") String placeId,
//			@RequestParam("password") String password,
//			@RequestParam("name") String name,
//			@RequestParam("address") String address) {
//		
//		Place place = this.frogbanchan.updatePlace(placeId, password, name, address)		
//		model.put("updated", place);
//
//		return ModelAndView("placeInfo");
//  }

}


