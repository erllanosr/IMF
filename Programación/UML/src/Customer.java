import java.util.ArrayList;

public class Customer extends User {
	private String name;
	private String billingAddress;
	private String defaultShippingAddress;
	private ArrayList<Order> listaPedidos;

	public Customer(int id, String email, String password, String lastLogin, String name, String billingAddress,
			String defaultShippingAddress) {
		super(id, email, password, lastLogin);
		this.name = name;
		this.billingAddress = billingAddress;
		this.defaultShippingAddress = defaultShippingAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getDefaultShippingAddress() {
		return defaultShippingAddress;
	}

	public void setDefaultShippingAddress(String defaultShippingAddress) {
		this.defaultShippingAddress = defaultShippingAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", billingAddress=" + billingAddress + ", defaultShippingAddress="
				+ defaultShippingAddress + "]";
	}

	public void signUp() {

	}

	public void login() {

	}
}
