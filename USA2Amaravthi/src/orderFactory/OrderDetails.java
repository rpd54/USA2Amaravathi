package orderFactory;

public class OrderDetails {
	
	private int OrderDetails_OID;
	private int OrderDetails_ProductID;
	private int OrderQuantity;
	public OrderDetails(int orderDetails_OID, int orderDetails_ProductID, int orderQuantity) {
		OrderDetails_OID = orderDetails_OID;
		OrderDetails_ProductID = orderDetails_ProductID;
		OrderQuantity = orderQuantity;
	}
	public int getOrderDetails_OID() {
		return OrderDetails_OID;
	}
	public void setOrderDetails_OID(int orderDetails_OID) {
		OrderDetails_OID = orderDetails_OID;
	}
	public int getOrderDetails_ProductID() {
		return OrderDetails_ProductID;
	}
	public void setOrderDetails_ProductID(int orderDetails_ProductID) {
		OrderDetails_ProductID = orderDetails_ProductID;
	}
	public int getOrderQuantity() {
		return OrderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		OrderQuantity = orderQuantity;
	}
	
	

}
