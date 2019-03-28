package com.cjx.controller;

import com.cjx.service.good.GoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class controller {
    @Resource
    GoodService goodService;

    @GetMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("list",goodService.list());
        return "good/list";
    }
}
