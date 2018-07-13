package orderFactory;

import orderFactory.Order;

import java.util.List;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderImplementation implements OrderDAO {
	
	  private Order extractUserFromResultSet(ResultSet rs) throws SQLException {
		Order order = new Order();
		order.setOrderID( rs.getInt("OrderID"));
	  	order.setOrder_UID(rs.getString("Order_UID"));
	  	java.sql.Date date = rs.getDate("OrderDate");
		LocalDate dt= date.toLocalDate();
		order.setOrderStats(OrderStatus.valueOf(rs.getString("OrderStatus")));
	    order.setOrderDate(dt);
	  	return order; 
	 }
	 
	@Override
	public boolean placeOrder(Order order) {

		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO `order` VALUES (?,?,?,?)");
			ps.setInt(1, order.getOrderID());
			ps.setString(2, order.getOrder_UID());
			Date date = Date.valueOf(order.getOrderDate());
			ps.setDate(3, date);
			ps.setString(4, order.getOrderStats().toString());
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteOrders(int Order_id,String Order_uid) {
		Connection connection =ConnectionFactory .getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM  `order` WHERE OrderID=" + Order_id+" and Order_UID= "+Order_uid);
            //System.out.println(i);
            if(i ==1) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Exception");
        }		return false;
	}

	@Override
	public List getOrders() {
		Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `order`");
            List<Order> orders= new ArrayList<>();
            while(rs.next())
            {
                Order order = extractUserFromResultSet(rs);
                orders.add(order);
            }
            return orders;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
	}

}
