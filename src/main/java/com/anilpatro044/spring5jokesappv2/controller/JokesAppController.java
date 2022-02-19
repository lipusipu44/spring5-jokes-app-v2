package com.anilpatro044.spring5jokesappv2.controller;

import com.anilpatro044.spring5jokesappv2.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesAppController {

    private JokesService jokesService;

    @Autowired
    public JokesAppController(@Qualifier("jokesServiceImpl") JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("jokes",jokesService.getJokes());
        return "jokes";
    }

}
