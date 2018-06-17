package com.Ranford.com.PageLibary.com;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public static void m(){
     try {
		System.out.println("start");
		Email mail=new SimpleEmail();
		mail.setAuthenticator(new DefaultAuthenticator("richakhemariya7@gmail","richa123@"));
		mail.setHostName("smtp.gmail.com");
		mail.setSmtpPort(465);
		mail.setSSL(true);
		mail.setFrom("richakhemariya7@gmail.com");
		mail.setSubject("failed");
		mail.addTo("richakhemariya@gmail.com");
		mail.send();
		System.out.println("succesfuii");
	} catch (EmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}}
