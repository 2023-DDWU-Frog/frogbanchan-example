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
public class ListHistoryController {

    private FrogBanchanFacade frogbanchan;

    @Autowired
    public void setFrogbanchan(FrogBanchanFacade frogbanchan) {
        this.frogbanchan = frogbanchan;
    }

//    @RequestMapping("/history/list.do")
//    public ModelAndView handleRequest(
//            @ModelAttribute("userSession") UserSession userSession
//    ) throws Exception {
//        String username = userSession.getAccount().getUsername();
//        return new ModelAndView("history", "historyList",
//                frogbanchan.findhistoryListsByUsername(username));
//    }
}