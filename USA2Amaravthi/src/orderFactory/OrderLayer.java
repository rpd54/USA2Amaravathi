package orderFactory;

public class OrderLayer {
	public static  OrderDAO OrderPlacing() {
		return new OrderImplementation();
	}

}
