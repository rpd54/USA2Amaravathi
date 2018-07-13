package orderFactory;

import java.time.LocalDate;
import java.util.List;

public class OrderMain {
	public static void main(String[] args) {
//		Order or=new Order(7,"4",LocalDate.of(2012,10,8)); 
		OrderDAO o=OrderLayer.OrderPlacing();
//		System.out.println(o.placeOrder(or));
		List<Order> l=o.getOrders();
//		for(Order a:l) {
//			System.out.println(a.getOrderID()+" ");
//			System.out.print(a.getOrder_UID()+" ");
//			System.out.print(a.getOrderDate()+" ");
//			System.out.print(a.getOrderStats()+" ");
//
//		}
		System.out.println(o.deleteOrders(4, "4"));
	}
}
