package com.controller;

import com.entity.Reply;
import com.service.services.ReplyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/reply")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    private Logger logger = Logger.getLogger(ReplyController.class);

    @RequestMapping(value = "/{wordsId}", method = RequestMethod.GET)
    public ModelAndView show(ModelAndView modelAndView, @PathVariable("wordsId") Long wordsId) {
        logger.info(wordsId);
        Reply reply = replyService.selectByPrimaryKey(wordsId);
        logger.info(reply);
        if (reply == null) {
            modelAndView.addObject("code", -10);

        } else {
            modelAndView.addObject("code", 10);
        }
        modelAndView.addObject("reply", reply);
        modelAndView.setViewName("reply");
        return modelAndView;
    }
}
