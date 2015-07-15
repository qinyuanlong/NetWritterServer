package com.qyl.comm.mail;

/**
 * Created by qinyuanlong on 15/7/15.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class MailHelperTest {

	@Test
	public void sendRegisterSuccessTest(){
		Exception exception = null;
		try {
			MailHelper.sendRegisterSuccess("251717592@qq.com");
		}catch (Exception e){
			exception = e;
		}
		assertEquals(exception,null);
	}

}
