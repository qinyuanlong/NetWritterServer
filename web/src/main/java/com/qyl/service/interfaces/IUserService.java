package com.qyl.service.interfaces;

import com.qyl.exception.user.UserExistException;
import com.qyl.vo.User;

import javax.servlet.http.HttpSession;

/**
 * Created by qinyuanlong on 15/7/20.
 */
public interface IUserService {
	void register(User user) throws UserExistException;
	int  login(User user);
}
