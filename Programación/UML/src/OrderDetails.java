
public class OrderDetails {

	private int id;
	private int orderID;
	private String shippingAddress;
	

	public OrderDetails(int id, int orderID, String shippingAddress) {
		super();
		this.id = id;
		this.orderID = orderID;
		this.shippingAddress = shippingAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderID=" + orderID + ", shippingAddress=" + shippingAddress + "]";
	}

	public void cancelOrder() {

	}
}
