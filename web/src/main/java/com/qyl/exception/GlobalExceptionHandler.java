package com.qyl.exception;

import com.qyl.exception.user.UserExistException;
import com.qyl.vo.BaseResult;
import com.qyl.vo.BizCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qinyuanlong on 15/7/15.
 */
@ControllerAdvice
public class GlobalExceptionHandler {



	/**
	 * 处理注册时用已存在的email注册
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UserExistException.class)
	@ResponseBody
	public BaseResult handleUserExist(UserExistException e){
		BaseResult baseResult = new BaseResult();
		baseResult.setResultId(BizCode.USER_EXIST);
		baseResult.setMessage(BizCode.USER_EXIST_MESSAGE);
		return baseResult;
	}

}
