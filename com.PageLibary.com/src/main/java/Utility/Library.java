package Utility;

import java.awt.AWTException;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Library {
	public static void screenshort(String screenshortname)
	{

		try {
			Robot r = new  Robot();


			BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

			ImageIO.write(bi, "png", new File(".\\screenshort\\"+screenshortname+".png"));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	public static  void attachement(String shreenshortname)
	{
		screenshort(shreenshortname);
		
		EmailAttachment email=new EmailAttachment();
		
		email.setPath("C:\\Users\\abhishek khemariya\\Desktop\\Raghu-sir-programing-class\\com.PageLibary.com\\screenshort\\"+shreenshortname+".png");
		
		email.setDisposition(EmailAttachment.ATTACHMENT);
		
		email.setDescription("adfsd");
		
		email.setName(shreenshortname);
		
		MultiPartEmail memail=new MultiPartEmail();
		
		
		try {
		memail.setAuthenticator(new DefaultAuthenticator("richakhemariya7@gmail.com", "richa123@"));
		memail.setHostName("smtp.gmail.com");
		memail.setSmtpPort(465);
		memail.setSSLOnConnect(true);
		memail.setFrom("richakhemariya7@gmail.com");
			
		memail.setSubject("report");
		memail.setMsg(shreenshortname);
		memail.addTo("richakhemariya@gmail.com");
		memail.attach(email);
		memail.send();
	} catch (Exception e) {
			e.printStackTrace();
	}
		
		}
		}








