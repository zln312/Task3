package com.controller;

import com.entity.Works;
import com.service.services.WorksService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping(value = "/works")
public class WorksController {
    private Logger logger = Logger.getLogger(WorksController.class);
    @Autowired
    private WorksService worksService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView show(@PathVariable("id") long id, ModelAndView modelAndView) {
        logger.info(id);
        Works works = worksService.selectByPrimaryKey(id);
        logger.info(works);
        if (works == null) {
            modelAndView.addObject("code", -6);
        } else {
            modelAndView.addObject("code", 6);
        }
        modelAndView.addObject("works", works);
        modelAndView.setViewName("works");
        return modelAndView;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView show(ModelAndView modelAndView, String name, Long secondId) {
        logger.info("name:" + name + " secondId:" + secondId);
        List list = worksService.select(name, secondId);
        if (list == null) {
            modelAndView.addObject("code", -7);
        } else {
            modelAndView.addObject("code", 7);
        }
        modelAndView.addObject("list", list);
        modelAndView.setViewName("worksList");
        return modelAndView;
    }
}
