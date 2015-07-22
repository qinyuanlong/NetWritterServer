package com.qyl.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qinyuanlong on 15/7/20.
 */
public class GlobalInterceptor implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception{
		// TODO: if(request.getRequestURI().contains 'login')  do something
		return null == request.getSession().getAttribute("auth");
	}

	public void postHandle(HttpServletRequest var1, HttpServletResponse var2, Object var3, ModelAndView var4) throws Exception{}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exception) throws Exception{
		System.out.println("after handler");
		// TODO: response 502 status
		// if(response.getStatus() == 502){ do something }
	}
}
