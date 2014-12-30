package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.framework.dao.UpdateEmailDAO;
import com.shinowit.model.TbaMemberinfo;
import com.shinowit.model.TbaMemberinfoExample;
import com.shinowit.tools.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * Created by SC on 2014/12/25.
 */
@Controller
@RequestMapping("/reg")
public class MemberInfoInsertController {

    @Resource
    private TbaMemberinfoMapper mapper_dao;

    @Resource
    private SendHtmlMail mail;

    @Resource
    private UpdateEmailDAO updateEmailDAO;

    @RequestMapping("/regover")
    public String memberinsert(@Valid @ModelAttribute("member") TbaMemberinfo memberinfo,BindingResult bindingResult,@RequestParam("password") String password,
                               @RequestParam("validcode") String validcode,HttpServletRequest request){
        memberinfo.setActivedate(new Date());
        memberinfo.setRegdate(new Date());
        memberinfo.setStatus(false);
        memberinfo.setBalance(BigDecimal.valueOf(0));
        if(bindingResult.hasErrors()){
            return "reg";
        }
        TbaMemberinfoExample te=new TbaMemberinfoExample();
        te.createCriteria().andEmailEqualTo(memberinfo.getEmail());
        te.createCriteria().andUsernameEqualTo(memberinfo.getUsername());
        List<TbaMemberinfo> userresult=mapper_dao.selectByExample(te);
        if(userresult.size()>0){
            return "reg";
        }
        if(!memberinfo.getPwd().equals(password)){
            return "reg";
        }
        HttpSession session=request.getSession(true);
        String wyh=(String)session.getAttribute("rand");
        if(!wyh.equals(validcode)){
            return "reg";
        }

        int i=mapper_dao.insert(memberinfo);
        if(i>0){
            String valid_id=request.getSession().getId();
            String valid_url="<a href='http://10.2.25.60:8080/reg/updateemail?valid="+valid_id+"&name="+memberinfo.getUsername()+"'>点击</a>";
            try {
                mail.sendMessage(memberinfo.getEmail(), "用户激活", valid_url);
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return "forward:/merchand/dispalymerchand";
        }else{
            return "reg";
        }
    }

    @RequestMapping("/updateemail")
    public String updateemail(@RequestParam("name") String name){
            boolean result=updateEmailDAO.updateEmail(name);
            if(result==true){
                return "forward:/merchand/dispalymerchand";
            }else{
                return "reg";
            }
    }

}



