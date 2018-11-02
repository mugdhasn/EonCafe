package com.mg.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.dao.MenuExistsException;
import com.model.Menu;
import com.service.MenuService;



@Path ("/Menu")
public class MenuRest {
	
	
	
	MenuService menuService=new MenuService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Menu> getMenu()
	{
		return menuService.getAllMenu();
		
	}

	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces (MediaType.APPLICATION_XML)
	public void addMenu(Menu menu) throws MenuExistsException
	{
		 menuService.addMenu(menu);
		
	}
	
	
	@DELETE
	@Path ("/{menuId}")
	@Produces (MediaType.APPLICATION_XML)
	public void deleteMenu(@PathParam ("menuId") int menuId)
	{

		menuService.removeMenu(menuId);
		
	}
	
	
	
	
	

}
