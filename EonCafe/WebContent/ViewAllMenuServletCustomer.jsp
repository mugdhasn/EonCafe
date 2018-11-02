<%@page import="com.model.Menu"%>
<%@page import="com.dao.MenuDaoImpl"%>
<%@page import="com.dao.MenuDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



		<%
			Object attr = request.getAttribute("menuList");
			List<Menu> menuList1 = (List<Menu>) attr;
		%>

		<table border=1>
			<tr>
				<td>MenuId</td>
				<td>VendorId</td>
				<td>Menu Name</td>
				<td>Menu Price</td>
				<td>Vendor Name</td>
			</tr>


			<%
				for (Menu menu1 : menuList1) {
			%>


			<tr>
				<td><%=menu1.getMid()%></td>
				<td><%=menu1.getVid()%></td>
				<td><%=menu1.getMname()%></td>
				<td><%=menu1.getMprice()%></td>
				<td><%=menu1.getVname()%></td>
				
			</tr>


			<%
				}
			%>



		</table>

<form action="ViewCustomerLogin.jsp" method="post">
	<input type="submit" value="LOGOUT" />
	</form>


</body>
</html>