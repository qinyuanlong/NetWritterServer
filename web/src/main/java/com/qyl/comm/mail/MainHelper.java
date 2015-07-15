package com.qyl.comm.mail;

import org.ho.yaml.Yaml;

import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 * Created by qinyuanlong on 15/7/14.
 */
public class MainHelper {
	public static void sendRegisterSuccess(String mailAddress) throws FileNotFoundException{
		HashMap map = Yaml.loadType((new Object()).getClass().getResourceAsStream("/config/mail.yaml"), HashMap.class);
		String title = ((HashMap)map.get("welcome_letters")).get("title").toString();
		String content = ((HashMap)map.get("welcome_letters")).get("content").toString();
		sendSimpleMail(mailAddress,title,content);
	}

	private static void sendSimpleMail(String mailAddress, String title, String content) throws FileNotFoundException{
		HashMap map = Yaml.loadType((new Object()).getClass().getResourceAsStream("/config/mail.yaml"), HashMap.class);
		MailSenderInfo mailSenderInfo = new MailSenderInfo();
		mailSenderInfo.setMailServerHost("smtp.163.com");
		mailSenderInfo.setMailServerPort("25");
		mailSenderInfo.setValidate(true);
		mailSenderInfo.setUserName(((HashMap) map.get("mail_163_bhbh113")).get("name").toString());
		mailSenderInfo.setPassword(((HashMap) map.get("mail_163_bhbh113")).get("password").toString());
		mailSenderInfo.setFromAddress(((HashMap) map.get("mail_163_bhbh113")).get("name").toString());
		mailSenderInfo.setToAddress(mailAddress);
		mailSenderInfo.setSubject(title);
		mailSenderInfo.setContent(content);

		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailSenderInfo);

	}
}


//	public static void main(String[] args){
//		//这个类主要是设置邮件
//		MailSenderInfo mailInfo = new MailSenderInfo();
//		mailInfo.setMailServerHost("smtp.163.com");
//		mailInfo.setMailServerPort("25");
//		mailInfo.setValidate(true);
//		mailInfo.setUserName("han2000lei@163.com");
//		mailInfo.setPassword("**********");//您的邮箱密码
//		mailInfo.setFromAddress("han2000lei@163.com");
//		mailInfo.setToAddress("han2000lei@163.com");
//		mailInfo.setSubject("设置邮箱标题 如http://www.guihua.org 中国桂花网");
//		mailInfo.setContent("设置邮箱内容 如http://www.guihua.org 中国桂花网 是中国最大桂花网站==");
//		//这个类主要来发送邮件
//		SimpleMailSender sms = new SimpleMailSender();
//		sms.sendTextMail(mailInfo);//发送文体格式
//		sms.sendHtmlMail(mailInfo);//发送html格式
//	}