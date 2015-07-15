package com.qyl.comm.mail;

/**
 * Created by qinyuanlong on 15/7/14.
 */
import javax.mail.*;

public class MyAuthenticator extends Authenticator{
	String userName=null;
	String password=null;

	public MyAuthenticator(){
	}
	public MyAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}
	protected PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(userName, password);
	}
}

