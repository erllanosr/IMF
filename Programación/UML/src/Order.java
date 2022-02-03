
public class Order {

	private int id;
	private int customerID;
	private String orderDate;
	private OrderDetails detalles; // Esto es una relación 1 a 1.
	

	public Order(int id, int customerID, String orderDate) {
		super();
		this.id = id;
		this.customerID = customerID;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customerID=" + customerID + ", orderDate=" + orderDate + "]";
	}

	public void updateOrderStatus() {

	}

	public void placeOrder() {

	}

	public void cancelOrder() {

	}

}
