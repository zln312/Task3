package com.controller;


import com.service.services.ArtService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller

public class ArtController {
    private Logger logger = Logger.getLogger(ArtController.class);

    @Autowired
    private ArtService artService;

    @RequestMapping(value = "/art/list", method = RequestMethod.GET)
    public ModelAndView select(ModelAndView modelAndView, Byte status, Byte type) {

        logger.info("status:" + status + " type:" + type);
        List list = artService.selectByPrimaryKey(status, type);
        modelAndView.addObject("list", list);
        modelAndView.addObject("code", 1);
        modelAndView.setViewName("art");
        return modelAndView;
    }


}
