package com.ws.mail;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.service.VendorService;

@WebService(name="MailWsdl")
/**
 * this class used for creating web service for mailing to customer from vendor 
 * @author Administrator
 *
 */
public class MailSoapWsdl {
	@WebMethod (exclude=false,operationName="sendMail")
	/**
	 * 
	 * 
	 * @param vendorMailId:sendor's mailId
	 * @param customerMailId:Customer's mailId
	 * @param password -password of vendor emailId
	 * @param oid-order id
	 * @return
	 */
	public boolean sendMail(String vendorMailId,String customerMailId,String password,int oid) 
	{
		//vendor-service have defination of sendMail() method
		VendorService vendorService=new VendorService();
		
		boolean status=vendorService.sendMail(vendorMailId, customerMailId, password, oid);
		//status returns result of mail is actully sent or not
		return status;
	}

}
