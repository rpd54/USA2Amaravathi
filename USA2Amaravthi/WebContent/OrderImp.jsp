<%@ page import="orderFactory.*,java.time.*,java.time.format.DateTimeFormatter,java.sql.*,com.mysql.jdbc.Driver"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Place your Order</title>
</head>
<body>
	    	 <% 
	    	 int oid=Integer.parseInt(request.getParameter("Order_ID"));
	    	 String uid=request.getParameter("Order_UID");
	    	 DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    	 LocalDate l=LocalDate.parse(request.getParameter("OrderDate"),d);
	    	 
	    	Order or=new Order(oid,uid,l);
	 		OrderDAO o=OrderLayer.OrderPlacing();
	 		boolean b= o.placeOrder(or);
	 		if (b==true){
	 		out.println("<h2>" +"Your Order was Confirmed ! " + "</h2>");
	 		}else{
	 			out.println("<h2>" +"Not from a Valid User " + "</h2>");
	 		}
	    	 %> 
	    	  	 
	    	 
</body>
</html>