package com.mg.rs;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.Vendor;
import com.service.VendorService;

@Path ("/Vendor")
public class VendorRest {

VendorService vendorService=new VendorService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Vendor> getVendor()
	{
		return vendorService.getAllVendor();
		
	}
	
	
}
