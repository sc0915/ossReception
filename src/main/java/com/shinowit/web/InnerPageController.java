package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.framework.dao.MerchandiseCInfoSelectDAO;
import com.shinowit.framework.dao.ProStatusInfoSelectDAO;
import com.shinowit.model.TmeMerchandiseinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by SC on 2014/12/28.
 */
@Controller
@RequestMapping("/inner")
public class InnerPageController {

    @Resource
    private MerchandiseCInfoSelectDAO merchandiseCInfoSelectDAO;

    @Resource
    private ProStatusInfoSelectDAO proStatusInfoSelectDAO;

    @Resource
    private TmeMerchandiseinfoMapper tmeMerchandiseinfoMapper;

    @RequestMapping("/dispalyinner/{merchandid}")
    public ModelAndView disinner(@PathVariable("merchandid")String merchand_id){
        ModelAndView result=new ModelAndView();
        TmeMerchandiseinfo tmer=tmeMerchandiseinfoMapper.selectmerchandAndUnitNameByPrimaryKey(merchand_id);
        List<Map<String,Object>> merchandisecinfoList=merchandiseCInfoSelectDAO.merchandisecinfoList();
        List<Map<String,Object>> prostatusinfoList=proStatusInfoSelectDAO.prostatusinfoList();
        result.addObject("merlist",merchandisecinfoList);
        result.addObject("prolist",prostatusinfoList);
        result.addObject("merchand",tmer);
        result.setViewName("innerpage");
        return result;
    }
}
