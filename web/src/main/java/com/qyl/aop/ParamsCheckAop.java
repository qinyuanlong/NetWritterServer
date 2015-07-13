package com.qyl.aop;

import com.qyl.comm.ControllerHelper;
import com.qyl.vo.BaseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.validation.BindingResult;

/**
 * Created by qinyuanlong on 15/7/13.
 */
//@Component
@Aspect
public class ParamsCheckAop {

	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void doAccessCheck(){}

	@Around("doAccessCheck()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		Object[] args = proceedingJoinPoint.getArgs();
		BindingResult bindingResult = null;
		for(Object arg:args){
			if(arg instanceof BindingResult){
				bindingResult = (BindingResult)arg;
				break;
			}
		}
		if(bindingResult != null && bindingResult.hasErrors()){
			//参数错误
			BaseResult result = ControllerHelper.paramsError(bindingResult);
			return result;
		}

		try {
			Object retVal = proceedingJoinPoint.proceed();
			System.out.println(retVal);
			return retVal;
		} catch (Exception e) {
			System.out.println("AOP异常");
			return null;
		}
	}

}
