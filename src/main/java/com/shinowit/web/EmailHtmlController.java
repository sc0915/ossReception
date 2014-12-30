package com.shinowit.web;

import com.shinowit.tools.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

/**
 * Created by SC on 2014/12/25.
 */
@Controller
@RequestMapping("/email")
public class EmailHtmlController {

    @Resource
    private SendHtmlMail mail;


    @RequestMapping("/sendmail")
    public void sendmail(@RequestParam("username") String username,@RequestParam("userpass") String userpass,@RequestParam("email") String email){

        String valid_url="<a href='http://blog.sina.com.cn/s/blog_537398b10100ossg.html'>点击</a>";

        try {
            mail.sendMessage(email,"用户激活",valid_url);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


}
