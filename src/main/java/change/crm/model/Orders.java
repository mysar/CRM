package change.crm.model;

import java.util.Date;

public class Orders {

	private Integer id;
	private Integer cusId;
	private String orderNo;
	private Date orderDate;
	private String address;
	private Integer state;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(Integer id, Integer cusId, String orderNo, Date orderDate, String address, Integer state) {
		super();
		this.id = id;
		this.cusId = cusId;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.address = address;
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCusId() {
		return cusId;
	}
	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
}
