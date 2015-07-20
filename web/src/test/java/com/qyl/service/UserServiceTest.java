package com.qyl.service;

import com.qyl.vo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by qinyuanlong on 15/7/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/config/applicationContext.xml"})
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void loginTest(){
		User user = new User();
		user.setMail("a003@qq.com");
		user.setPassword("123");
		int loginResult = userService.login(user);
		Assert.assertEquals(1,loginResult);
	}

}
