
public class ShoppingCart {
	private int id;
	private int productID;

	public ShoppingCart(int id, int productID) {
		super();
		this.id = id;
		this.productID = productID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", productID=" + productID + "]";
	}

}
