<%@page import="com.model.Order"%>
<%@page import="com.dao.OrderDaoImpl"%>
<%@page import="com.dao.OrderDAO"%>
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
	Object attr = request.getAttribute("orderList");
	List<Order> orderList1 = (List<Order>) attr;

		
	%>

	<table border=1>
		<tr>
			<td>OrderId</td>
			<td>Customer</td>
			<td>CustomerName</td>
			<td>CustomerEmail</td>
			<td>VendorId</td>
			<td>MenuId</td>
		
		</tr>

		<%
			for (Order e : orderList1) {
		%>
		<tr>
			<td><%=e.getOid()%></td>
			<td><%=e.getCid()%></td>
			<td><%=e.getCname()%></td>
			<td><%=e.getCemail()%></td>
			<td><%=e.getVid()%></td>
			<td><%=e.getMid()%></td>
			
		</tr>

		<%
			}
		%>

	</table>


	<form action="ViewAdminOperation.jsp" method="post">
		<input type="submit" value="GO TO OPERATIONS PAGE" />
	</form>



<form action="ViewAdminLogin.jsp" method="post">
	<input type="submit" value="LOGOUT" />
	</form>








</body>
</html>