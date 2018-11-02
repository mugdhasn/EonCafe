package com.mg.menu;

import java.util.List;


public class ClientMenuService {

	public static void main(String[] args) {
	MenuWsdlService m=new MenuWsdlService();
	MenuWsdlProject menuWsdlProjectPort = m.getMenuWsdlProjectPort();
	List<Menu> menu = menuWsdlProjectPort.getMenu();
	for( Menu m1:menu)
		System.out.println(m1.getMname());

	}
}
