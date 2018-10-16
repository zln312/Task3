package com.controller;


import com.service.services.FirstService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value = "/first")
public class FirstController {
    @Autowired
    private FirstService firstService;
    private Logger logger = Logger.getLogger(FirstController.class);

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView show(ModelAndView modelAndView,Boolean status,String name){
     logger.info("status:"+status+" name:"+name);
      List list=  firstService.selectByPrimaryKey(name,status);
      if (list==null){
          modelAndView.addObject("code",-4);
      }else {
          modelAndView.addObject("code",4);
      }
        modelAndView.addObject("list",list);
        modelAndView.setViewName("first");
        return modelAndView;
    }
}
