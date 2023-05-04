package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
@SessionAttributes("userSession")
public class ListPlaceMenuController {

    private FrogBanchanFacade frogbanchan;

    @Autowired
    public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
        this.frogbanchan = frogbanchan;
    }


//    @RequestMapping("/placemenu/list.do")
//    public ModelAndView handleRequest(
//            @ModelAttribute("userSession") UserSession userSession
//    ) throws Exception {
//        String place_id = userSession.getAccount().getUsername();
//        return new ModelAndView("응답할 뷰 이름", "placeMenuList",
//                frogbanchan.findMenuListByPlaceId(place_id));
//    }
}