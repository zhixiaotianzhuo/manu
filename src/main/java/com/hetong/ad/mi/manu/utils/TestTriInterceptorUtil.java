package com.hetong.ad.mi.manu.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by MANU on 2018/6/28.
 */
@Component
public class TestTriInterceptorUtil implements HandlerInterceptor {
    /**
     * 该方法将在请求处理之前进行调用。
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("========TriInterception -- preHandle=========");
        return true;
    }

    /**
     * Controller 方法调用之后执行，但是它会在DispatcherServlet 进行视图返回渲染之前被调用
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        System.out.println("========TriInterception -- postHandle=========");
    }

    /**
     * 在DispatcherServlet 渲染了对应的视图之后执行。这个方法的主要作用是用于进行资源清理工作的。
     *
     * @param request
     * @param response
     * @param handler
     * @param exception
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
            throws Exception {

        System.out.println("========TriInterception -- afterCompletion=========");
        System.out.println(exception);
    }
}
