package com.shinowit.framework.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by SC on 2014/12/29.
 */
public class ShopInter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session=request.getSession();
        if(session.getAttribute("loginsession")!=null){
               return true;
        }

        String uri=request.getRequestURI();
        if((uri.endsWith("/login/userlog"))||(uri.endsWith("/reg/regover"))||(uri.endsWith("/reg/updateemail")||
                (uri.endsWith("/merchand/dispalymerchand")||(uri.endsWith("/index/userreg"))||(uri.endsWith("/index/log"))
                ||(uri.endsWith("/inner/dispalyinner"))||(uri.endsWith("/merchandiseinfo/dispalymerchandiseinfo"))||
                        (uri.endsWith("/merchandiseinfo/prostauts"))||(uri.startsWith("/css"))||(uri.startsWith("/js"))||(uri.startsWith("/page"))||(uri.startsWith("/common"))||(uri.startsWith("/images"))))){
                return true;
        }

            response.sendRedirect(request.getContextPath()+"/index/log");
            return false;
    }



    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
