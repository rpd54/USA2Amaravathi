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
				<div>
				<%
				OrderDAO o=OrderLayer.OrderPlacing();
        		List<Order> l=o.getOrders();
        		String userid = request.getParameter("User_Id");
        		int orderid = Integer.parseInt(request.getParameter("Order_Id"));
        			 
			    		boolean c=o.deleteOrders(orderid,userid);
			    		if(c){
			 	 		out.println("<h2>" +"Order " + orderid + " of the " + userid +"was Deleted ! </h2>"); 
			 	 		}else{
			 	 			out.println("<h2>" +"Not a Vaild Order" + "</h2>");
			 	 		}
			    	 
			    	 %> 
			    	 </div>
			    	 
			    	 <br>
			    	 <br>
			    	
	
			    	  

</body>
</html>