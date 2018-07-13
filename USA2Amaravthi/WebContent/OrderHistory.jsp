<%@ page import="orderFactory.*,java.time.*,java.util.List,java.time.format.DateTimeFormatter,java.sql.*,com.mysql.jdbc.Driver"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style >
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
</style>
<title>Order History</title>
</head>
<body>
<%
OrderDAO o=OrderLayer.OrderPlacing();
List<Order> l=o.getOrders();
%>

<div >
        <table border="1" cellpadding="5"style="position: absolute; top: 0; bottom: 0; left: 0; right: 0;">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>OrderID</th>
                <th>UserId</th>
                <th>Date Ordered</th>
                <th>Status of Order</th>
            </tr>
                <% for(Order a:l) {
					if(request.getParameter("UserId").equals(a.getOrder_UID())){ %>
         
                    <td> <%= a.getOrderID() %></td>
                    <td><%=a.getOrder_UID() %></td>
                    <td><%= a.getOrderDate()%></td>
                    <td><%=a.getOrderStats() %></td>  
                    </tr>
                    <%} }%>
        </table>
    </div>
    
</body>
</html>