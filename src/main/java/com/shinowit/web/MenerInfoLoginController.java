package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.model.TbaMemberinfo;
import com.shinowit.model.TbaMemberinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by SC on 2014/12/26.
 */
@Controller
@RequestMapping("/login")
public class MenerInfoLoginController {

    @Resource
    private TbaMemberinfoMapper mapper_dao;

    @RequestMapping("/userlog")
    public String login(@ModelAttribute("member")TbaMemberinfo memberinfo,HttpServletRequest request){
        TbaMemberinfoExample te=new TbaMemberinfoExample();
        te.createCriteria().andUsernameEqualTo(memberinfo.getUsername());
        te.createCriteria().andPwdEqualTo(memberinfo.getPwd());
        List<TbaMemberinfo> memberinfoList=mapper_dao.selectByExample(te);
        if(memberinfoList.size()>0){
            for(TbaMemberinfo t:memberinfoList){
                if(t.getStatus()==true){
                    HttpSession session=request.getSession(true);
                    session.setAttribute("loginsession",memberinfo);
                    return "forward:/merchand/dispalymerchand";
                }else{
                    return "login";
                }
            }
        }else{
            return "login";
        }
        return "login";
    }
}
