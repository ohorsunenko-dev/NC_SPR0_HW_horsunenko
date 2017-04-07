package com.horsunenko.controller;

import com.horsunenko.dao.InfoDao;
import com.horsunenko.model.Info;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
    InfoDao infoDao = (InfoDao) context.getBean("infoDao");

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ModelAndView InsertInfo(@ModelAttribute Info info) {
        infoDao.insertInfo(info);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String viewIndex(Model model){
        Info info = infoDao.getById(1);
        model.addAttribute("id", info.getId());
        model.addAttribute("lastName", info.getLastName());
        model.addAttribute("firstName", info.getFirstName());
        model.addAttribute("comment", info.getLastName());

        return "hello";
    }
}