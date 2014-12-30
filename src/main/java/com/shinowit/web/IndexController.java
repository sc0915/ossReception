package com.shinowit.web;

import com.shinowit.model.TbaMemberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SC on 2014/12/25.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/userreg")
    public String reg(@ModelAttribute("member")TbaMemberinfo memberinfo){
        return "reg";
    }

    @RequestMapping("/log")
    public String userlogin(@ModelAttribute("member")TbaMemberinfo memberinfo){
        return "login";
    }
}
