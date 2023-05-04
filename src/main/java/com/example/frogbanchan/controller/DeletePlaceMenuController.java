package com.example.frogbanchan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.frogbanchan.service.FrogBanchanFacade;

@Controller
@SessionAttributes("userSession")
public class DeletePlaceMenuController {

    private FrogBanchanFacade frogbanchan;

    @Autowired
    public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
        this.frogbanchan = frogbanchan;
    }

//    @RequestMapping("placemenu/delete.do")
//    public ModelAndView handleRequest(
//            @RequestParam("placeMenuId") int placeMenuId,
//            @ModelAttribute("userSession") UserSession userSession
//    ) throws Exception {
//        userSession.deletePlaceMenu(placeMenuId);
//        return new ModelAndView("응답할 뷰", "userSession", userSession);
//    }
}