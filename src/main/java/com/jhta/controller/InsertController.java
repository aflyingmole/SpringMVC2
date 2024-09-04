package com.jhta.controller;

import com.jhta.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import test.vo.MembersVo;

@Controller
public class InsertController {
    @Autowired
    private MembersService service;

    @GetMapping("/members/insert")
    public String insertForm() {
        return "members/insert";
    }

    @PostMapping("/members/insert")
    public ModelAndView insert(MembersVo vo) {
        System.out.println("vo :" + vo);
        String code = "success";
        try {
            service.insert(vo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            code = "fail";
        }

        // 생성자 파라미터는 "members/result" 뷰이름이 된다.
        ModelAndView mv = new ModelAndView("members/result");
        mv.addObject("code", code);
        return mv;
    }
}
