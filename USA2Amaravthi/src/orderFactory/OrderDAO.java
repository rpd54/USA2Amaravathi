package orderFactory;

import java.util.List;

public interface OrderDAO {
	boolean placeOrder(Order Order);
	List getOrders();
	boolean deleteOrders(int OrderID,String Order_UID);

}
