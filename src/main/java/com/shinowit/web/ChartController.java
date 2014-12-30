package com.shinowit.web;

import com.shinowit.dao.mapper.ShoppingCarMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * Created by SC on 2014/12/28.
 */
@Controller
@RequestMapping("/chart")
public class ChartController {

    @Resource
    private TbaMembeaddrinfoMapper tbaMembeaddrinfoMapper;

    @Resource
    private ShoppingCarMapper shoppingmapper;

    @RequestMapping("/insertchart")
    public String insertchart(@RequestParam("num")int num,
                              @RequestParam("merchand_name") String commodityName,
                              @RequestParam("merchand_price")BigDecimal unitPrice,
                              HttpServletRequest request){
        HttpSession session=request.getSession(true);
        TbaMemberinfo shop=(TbaMemberinfo)session.getAttribute("loginsession");
        ShoppingCar car=new ShoppingCar();
        String uuid= UUID.randomUUID().toString();
        car.setId(uuid);
        car.setCommodityName(commodityName);
        car.setUnitPrice(unitPrice);
        BigDecimal b=BigDecimal.valueOf(num);
        car.setNum(num);
        car.setCountPrice(unitPrice.multiply(b));
        car.setUserName(shop.getUsername());
        int i=shoppingmapper.insert(car);
        if(i>0){
            return "forward:/chart/dischart";
        }else{
            return "forward:/inner/dispalyinner";
        }
    }


    @RequestMapping("/dischart")
    public ModelAndView dischart(HttpServletRequest request){
        ModelAndView result=new ModelAndView();
        HttpSession session=request.getSession(true);
        TbaMemberinfo memberinfo=(TbaMemberinfo)session.getAttribute("loginsession");
        ShoppingCarExample sc=new ShoppingCarExample();
        sc.createCriteria().andUserNameEqualTo(memberinfo.getUsername());
        List<ShoppingCar> shoplist= shoppingmapper.selectByExample(sc);
        int count_num=0;
        BigDecimal count_price=BigDecimal.valueOf(0);
        for(int i=0;i<shoplist.size();i++){
            count_num += shoplist.get(i).getNum();
            count_price=count_price.add(shoplist.get(i).getCountPrice());
        }
        result.addObject("count_num",count_num);
        result.addObject("count_price",count_price);
        result.addObject("disshop",shoplist);
        result.setViewName("chart");
        return result;
    }


    @RequestMapping("/delchart/{id}")
    public String delchart(@PathVariable("id")String id,RedirectAttributes redirectAttributes){
        int i=shoppingmapper.deleteByPrimaryKey(id);
        if(i>0){
            redirectAttributes.addFlashAttribute("msg","删除成功！");
            return "forward:/chart/dischart";
        }else{
            redirectAttributes.addFlashAttribute("msg","删除失败！");
            return "forward:/chart/dischart";
        }
    }


    @RequestMapping("/chatradder")
    public ModelAndView chartadder(@ModelAttribute("meradder")TbaMembeaddrinfo membeaddrinfo,HttpServletRequest request){
        ModelAndView result=new ModelAndView();
        HttpSession session=request.getSession(true);
        TbaMemberinfo memberinfo=(TbaMemberinfo)session.getAttribute("loginsession");
        TbaMembeaddrinfoExample te=new TbaMembeaddrinfoExample();
        te.createCriteria().andUsernameEqualTo(memberinfo.getUsername());
        List<TbaMembeaddrinfo> addlist=tbaMembeaddrinfoMapper.selectByExample(te);
        result.addObject("add_list",addlist);
        result.setViewName("chartadderss");
        return result;
    }

    @RequestMapping("/addchart")
    public String addchart(@ModelAttribute("meradder")TbaMembeaddrinfo membeaddrinfo,HttpServletRequest request){
        HttpSession session=request.getSession(true);
        TbaMemberinfo memberinfo=(TbaMemberinfo)session.getAttribute("loginsession");
        String uuid=UUID.randomUUID().toString();
        membeaddrinfo.setId(uuid);
        membeaddrinfo.setUsername(memberinfo.getUsername());
        int i = tbaMembeaddrinfoMapper.insert(membeaddrinfo);
        if(i>0){
            return "forward:/chart/chatradder";
        }else{
            return "forward:/chart/chatradder";
        }
    }


    @RequestMapping("/delchartadd/{id}")
    public String delchartadd(@PathVariable("id")String id){
        int i =tbaMembeaddrinfoMapper.deleteByPrimaryKey(id);
        if(i>0){
            return "forward:/chart/chatradder";
        }
            return "forward:/chart/chatradder";
    }


    @RequestMapping("/chartinfo/{id}")
    public ModelAndView chartinfo(@PathVariable("id") String id){
        ModelAndView result=new ModelAndView();
        TbaMembeaddrinfo tbaMembeaddrinfo=tbaMembeaddrinfoMapper.selectByPrimaryKey(id);
        result.addObject("meradd",tbaMembeaddrinfo);
        result.setViewName("chartinfo");
        return result;
    }

    @RequestMapping("/chartorder")
    public String chartorder(){
        return "chartorder";
    }

    @RequestMapping("chartover")
    public String chartover(){
        return "chartover";
    }
}
