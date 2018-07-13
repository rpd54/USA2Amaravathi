package orderFactory;

import java.time.LocalDate;

import orderFactory.OrderStatus;

public class Order {
	private int OrderID;
	private String Order_UID;
	private LocalDate OrderDate;
	private  OrderStatus OrderStats;
	
	public Order() {
		super();
	}

	//OrderStatus ordr=OrderStatus.Initiated;
	public Order(int orderID, String order_UID, LocalDate orderDate) {
		super();
		OrderID = orderID;
		Order_UID = order_UID;
		OrderDate = orderDate;
		OrderStats= OrderStatus.Initiated;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getOrder_UID() {
		return Order_UID;
	}

	public void setOrder_UID(String order_UID) {
		Order_UID = order_UID;
	}

	public LocalDate getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}

	public  OrderStatus getOrderStats() {
		return OrderStats;
	}

	public  void setOrderStats(OrderStatus orderStats) {
		OrderStats = orderStats;
	}
}
