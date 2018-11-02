package com.ws.mail;

import com.service.VendorService;

public class ClientMainForMail {

	
	public static void main(String[] args) {
		MailSoapWsdlService mail=new MailSoapWsdlService();
		MailWsdl mailWsdlPort = mail.getMailWsdlPort();
//		String vendorMail;
//		
//		String customerMail;
//		String vendorPassword;
//		int orderId;
		boolean sendMail = mailWsdlPort.sendMail( "biteseoncafepune@gmail.com", "mugdhanandurkar@gmail.com","@bites123#",50);
		System.out.println("mail status "+sendMail);
	}
	
	
	
}
