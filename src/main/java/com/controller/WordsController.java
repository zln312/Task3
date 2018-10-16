package com.controller;

import com.entity.Words;
import com.service.services.WordsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller

public class WordsController {
    private Logger logger = Logger.getLogger(WordsController.class);

    @Autowired
    private WordsService wordsService;

    @RequestMapping(value = "/words/{worksId}", method = RequestMethod.GET)
    public ModelAndView show(ModelAndView modelAndView, @PathVariable("worksId") long worksId) {
        List words = wordsService.selectByWorksId(worksId);
        if (words == null) {
            modelAndView.addObject("code", -8);
        } else {
            modelAndView.addObject("code", 8);
        }
        modelAndView.addObject("words", words);
        modelAndView.setViewName("words");
        return modelAndView;
    }

    @RequestMapping(value = "words",method = RequestMethod.POST)
    public ModelAndView add(ModelAndView modelAndView, String visitor, String content, long worksId) {
        logger.info("访客：" + visitor + "  内容:" + content + " 所属作品id:" + worksId);
        Words words = new Words();
        words.setVisitor(visitor);
        words.setContent(content);
        words.setWorksId(worksId);
        logger.info(words);
        if (wordsService.insertSelective(words) == 1) {
            modelAndView.addObject("code", 9);
        } else {
            modelAndView.addObject("code", -9);
        }
        modelAndView.setViewName("addWords");
        return modelAndView;
    }
}
