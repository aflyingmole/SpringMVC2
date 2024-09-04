package com.jhta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
    @PostMapping("/add")
    public ModelAndView add(int num1, int num2) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        int sum = num1 + num2;
        mv.addObject("sum", sum);
        return mv;
    }
}
