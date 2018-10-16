package com.controller;


import com.service.services.SecondService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value = "/second")
public class SecondController {

    private Logger logger = Logger.getLogger(SecondController.class);

    @Autowired
    private SecondService secondService;

    @RequestMapping(value = "/list")
    public ModelAndView show(ModelAndView modelAndView, String name, Boolean status, Long firstId) {
        logger.info("name:"+name+" status:"+status+" firstId:"+firstId);
        List list = secondService.select(name,status,firstId);
        logger.info(list);
        if(list==null){
            modelAndView.addObject("code",-5);
        }else {
            modelAndView.addObject("code",5);
        }
        modelAndView.addObject("list",list);
        modelAndView.setViewName("second");
        return modelAndView;
    }
}
