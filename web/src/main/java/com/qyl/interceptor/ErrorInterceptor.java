package com.qyl.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qinyuanlong on 15/7/20.
 */
public class ErrorInterceptor implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest var1, HttpServletResponse var2, Object var3) throws Exception{
		return true;
	}

	public void postHandle(HttpServletRequest var1, HttpServletResponse var2, Object var3, ModelAndView var4) throws Exception{}

	public void afterCompletion(HttpServletRequest var1, HttpServletResponse var2, Object var3, Exception var4) throws Exception{
		System.out.println("after handle interceptor");
	}
}
