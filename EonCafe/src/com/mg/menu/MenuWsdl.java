package com.mg.menu;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dao.MenuDao;
import com.dao.MenuDaoImpl;
import com.model.Menu;

@WebService(name="MenuWsdlProject")
public class MenuWsdl {
	
		
		@WebMethod (exclude=false,operationName="getMenu")
		public List<Menu> AllMenuList()
		{
			MenuDao menuDao=new MenuDaoImpl();
			List<Menu> menulist1=menuDao.getAllMenu();
			for(Menu c:menulist1)
			{
				//System.out.println(c);
				return menulist1;
			}
			
			return null;
			
		}
		
		
	}