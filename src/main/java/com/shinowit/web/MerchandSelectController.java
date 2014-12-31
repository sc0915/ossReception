package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.framework.dao.MerchandiseCInfoSelectDAO;
import com.shinowit.framework.dao.MerchandiseinfoDAO;
import com.shinowit.framework.dao.ProStatusInfoSelectDAO;
import com.shinowit.model.TmeMerchandiseinfo;
import com.shinowit.model.TmeMerchandiseinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by SC on 2014/12/26.
 */
@Controller
@RequestMapping("/merchand")
public class MerchandSelectController {

    @Resource
    private MerchandiseCInfoSelectDAO merchandiseCInfoSelectDAO;

    @Resource
    private ProStatusInfoSelectDAO proStatusInfoSelectDAO;

    @Resource
    private MerchandiseinfoDAO merchandiseinfoDAO;

    @Resource
    private TmeMerchandiseinfoMapper merchandiseinfoMapper;


    @RequestMapping("/dispalymerchand")
    public ModelAndView merchanddis(@ModelAttribute("mercha")TmeMerchandiseinfo merchandiseinfo,@RequestParam(value = "pageid",required = false) Integer pageid,
                                    @RequestParam(value = "merchandisecid",required = false) String merchandisecid,
                                    @RequestParam(value = "prostatusid",required = false)Integer prostatusid){
        ModelAndView result=new ModelAndView();
        if(pageid==null){
            pageid=1;
        }
        int countpage=0;
        if(((merchandisecid==null)&&(prostatusid==null))){
            try {
                TmeMerchandiseinfoExample te=new TmeMerchandiseinfoExample();
                te.setPageIndex(pageid);
                te.setPageSize(8);
                List<TmeMerchandiseinfo> merchandlist=merchandiseinfoMapper.selectPage(te);
                result.addObject("merchandlist",merchandlist);
                TmeMerchandiseinfoExample te1=new TmeMerchandiseinfoExample();
                te1.createCriteria().andMerchandiseidIsNotNull();
                int record_count=merchandiseinfoMapper.countByExample(te1);
                countpage=record_count/8;
                if(record_count%8>0){
                    countpage=countpage+1;
                }
                result.addObject("countnum",countpage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if((merchandisecid!=null)&&(prostatusid==null)){
            try {
                TmeMerchandiseinfoExample te=new TmeMerchandiseinfoExample();
                te.setPageIndex(pageid);
                te.setPageSize(8);
                te.createCriteria().andMerchandisecidEqualTo(merchandisecid);
                List<TmeMerchandiseinfo> merchandlist=merchandiseinfoMapper.selectPage(te);
                result.addObject("merchandlist",merchandlist);
                TmeMerchandiseinfoExample te1=new TmeMerchandiseinfoExample();
                te1.createCriteria().andMerchandisecidEqualTo(merchandisecid);
                int record_count=merchandiseinfoMapper.countByExample(te1);
                countpage=record_count/8;
                if(record_count%8>0){
                    countpage=countpage+1;
                }
                result.addObject("countnum",countpage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if((prostatusid!=null)&&(merchandisecid==null)){
            try {
                TmeMerchandiseinfoExample te=new TmeMerchandiseinfoExample();
                te.setPageIndex(pageid);
                te.setPageSize(8);
                te.createCriteria().andProstatusidEqualTo(prostatusid);
                List<TmeMerchandiseinfo> merchandlist=merchandiseinfoMapper.selectPage(te);
                result.addObject("merchandlist",merchandlist);
                TmeMerchandiseinfoExample te1=new TmeMerchandiseinfoExample();
                te1.createCriteria().andProstatusidEqualTo(prostatusid);
                int record_count=merchandiseinfoMapper.countByExample(te1);
                countpage=record_count/8;
                if(record_count%8>0){
                    countpage=countpage+1;
                }
                result.addObject("countnum",countpage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        List<Map<String,Object>> merchandisecinfoList=merchandiseCInfoSelectDAO.merchandisecinfoList();
        List<Map<String,Object>> prostatusinfoList=proStatusInfoSelectDAO.prostatusinfoList();
        result.addObject("merlist", merchandisecinfoList);
        result.addObject("prolist",prostatusinfoList);
        result.addObject("pageid",pageid);
        result.setViewName("/index");
        return result;
    }
}
