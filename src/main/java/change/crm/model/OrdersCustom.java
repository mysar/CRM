package change.crm.model;

public class OrdersCustom extends Orders {

	private String cname;
	public OrdersCustom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "OrdersCustom [cname=" + cname + ", getId()=" + getId() + ", getCusId()=" + getCusId()
				+ ", getOrderNo()=" + getOrderNo() + ", getOrderDate()=" + getOrderDate() + ", getAddress()="
				+ getAddress() + ", getState()=" + getState() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
