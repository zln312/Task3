package com.controller;


import com.service.services.BannerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value = "/banner")
public class BannerController {
    private Logger logger = Logger.getLogger(BannerController.class);
    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView showOne(@PathVariable("id") long id, ModelAndView modelAndView) {
        logger.info(id);
        List list = bannerService.selectByPrimaryKey(id);
        if (list == null) {
            modelAndView.addObject("code", -2);
        } else {
            modelAndView.addObject("code", 2);
        }
        logger.info(list);
        modelAndView.addObject("list", list);
        modelAndView.setViewName("banner");
        return modelAndView;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView show(ModelAndView modelAndView, Boolean status) {
        logger.info(status);
        List list = bannerService.selectByStatus(status);
        if (list == null) {
            modelAndView.addObject("code", -3);
        } else {
            modelAndView.addObject("code", 3);
        }
        logger.info(list);
        modelAndView.addObject("list", list);
        modelAndView.setViewName("banner");
        return modelAndView;
    }
}
