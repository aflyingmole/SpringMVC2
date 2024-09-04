package com.jhta.controller;

import com.jhta.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import test.vo.MembersVo;

@Controller
public class UpdateController {
    @Autowired
    private MembersService service;

    @GetMapping("/members/update")
    public ModelAndView updateForm(int num) {
        ModelAndView mv = new ModelAndView("members/update");
        mv.addObject("vo", service.select(num));
        return mv;
    }

//    @PostMapping("/members/update")
//    public ModelAndView update(MembersVo vo) {
//        System.out.println("vo :" + vo);
//        String code = "success";
//        try {
//            service.update(vo);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            code = "fail";
//        }
//        ModelAndView mv = new ModelAndView("members/result");
//        mv.addObject("code", code);
//        return mv;
//    }

    @PostMapping("/members/update")
    public String update(MembersVo vo, Model model) {
        try {
            service.update(vo);
            return "redirect:/members/list";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            model.addAttribute("code", "error");
            return "members/result";
        }
    }
}
