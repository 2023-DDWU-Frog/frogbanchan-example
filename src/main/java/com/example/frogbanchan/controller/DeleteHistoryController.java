package com.example.frogbanchan.controller;

import java.sql.Timestamp;

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
public class DeleteHistoryController {

    private FrogBanchanFacade frogbanchan;

    @Autowired
    public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
        this.frogbanchan = frogbanchan;
    }
//
//    @RequestMapping("history/delete.do")
//    public ModelAndView handleRequest(
//            @RequestParam("recordedDate") Timestamp recordedDate,
//            @ModelAttribute("userSession") UserSession userSession
//    ) throws Exception {
//        String username = userSession.getAccount().getUsername();
//        userSession.deleteHistory(username, recordedDate);
//        return new ModelAndView("history", "usersession", userSession);
//    }
}