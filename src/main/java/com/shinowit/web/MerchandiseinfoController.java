package com.shinowit.web;

import com.shinowit.framework.dao.MerchandiseinfoDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by SC on 2014/12/26.
 */
@Controller
@RequestMapping("/merchandiseinfo")
public class MerchandiseinfoController {

    @Resource
    private MerchandiseinfoDAO merchandiseinfoDAO;


    @RequestMapping("/dispalymerchandiseinfo")
    @ResponseBody
    public List<Map<String,Object>> merchandinfo(@RequestParam("merchandisecid") String merchandisecid){
        List<Map<String,Object>> result=merchandiseinfoDAO.merchandlist(merchandisecid);
        return result;
    }


    @RequestMapping("/prostauts")
    @ResponseBody
    public List<Map<String,Object>> prostatus(String prostatusid){
        List<Map<String,Object>> list=merchandiseinfoDAO.prostatus(prostatusid);
        return list;
    }
}
