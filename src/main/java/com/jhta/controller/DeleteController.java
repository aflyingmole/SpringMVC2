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
public class DeleteController {
    @Autowired
    private MembersService service;

//    @GetMapping("/members/delete")
//        public ModelAndView delete(int num) {
//            String code = "success";
//            try {
//                service.delete(num);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                code = "fail";
//            }
//
//            // 생성자 파라미터는 "members/result" 뷰이름이 된다.
//            ModelAndView mv = new ModelAndView("members/result");
//            mv.addObject("code", code);
//            return mv;
//        }

    @GetMapping("/members/delete")
    public String delete(int num, Model model) {
        try {
            service.delete(num);
            return "redirect:/members/list";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            model.addAttribute("code", "error");
            return "members/result";
        }
    }
}
