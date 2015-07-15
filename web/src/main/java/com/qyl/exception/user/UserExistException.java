package com.qyl.exception.user;

import com.qyl.vo.BizCode;

/**
 * Created by qinyuanlong on 15/7/15.
 */
public class UserExistException extends Exception {

	public UserExistException(){
		super(BizCode.USER_EXIST_MESSAGE);
	}

}
