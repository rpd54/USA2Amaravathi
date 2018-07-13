<%@ page import="orderFactory.*,java.time.*,java.util.List,java.time.format.DateTimeFormatter,java.sql.*,com.mysql.jdbc.Driver"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 15px;
}
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
h1{
	color:green;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
String s;
%>
		<div>
        <table>
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>OrederID</th>
                <th>UserId</th>
                <th>Date Ordered</th>
                <th>Status of Order</th>
            </tr>
                <% 
                OrderDAO o=OrderLayer.OrderPlacing();
        		List<Order> l=o.getOrders();
                for(Order a:l) {
                	s=request.getParameter("UserId");
					if(s.equals(a.getOrder_UID())){ %>
					<tr>
                    <td> <%= a.getOrderID() %></td>
                    <td><%=a.getOrder_UID() %></td>
                    <td><%= a.getOrderDate()%></td>
                    <td><%=a.getOrderStats() %></td>  
                    </tr>
                    <%} 
					}%>
        </table>
        </div>
        <div>
        <div>
		<form action="delete2.jsp">
			Enter userId:
			<input type="text" name="User_Id"> 
			Enter OrderId:
			<input type="text" name="Order_Id"> 
			<input type="submit" value="Delete_Orders">
		</form>
	</div>
        </div>
</body>
</html>