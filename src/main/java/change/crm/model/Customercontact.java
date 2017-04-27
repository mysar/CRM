package change.crm.model;

import java.io.Serializable;
import java.util.Date;

public class Customercontact implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer cusId;
	private Date  contactTime;
	private String address;
	private String overview;
	public Customercontact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customercontact(Integer id, Integer cusId, Date contactTime, String address, String overview) {
		super();
		this.id = id;
		this.cusId = cusId;
		this.contactTime = contactTime;
		this.address = address;
		this.overview = overview;
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
	public Date getContactTime() {
		return contactTime;
	}
	public void setContactTime(Date contactTime) {
		this.contactTime = contactTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	@Override
	public String toString() {
		return "Customercontact [id=" + id + ", cusId=" + cusId + ", contactTime=" + contactTime + ", address="
				+ address + ", overview=" + overview + "]";
	}
	
}
