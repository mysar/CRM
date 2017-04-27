package change.crm.model;

import java.io.Serializable;

public class CustomerLinkman implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer cusId;
	private String linkName;
	private String sex;
	private String zhiwei;
	private String officePhone;
	private String phone;
	public CustomerLinkman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLinkman(Integer id, Integer cusId, String linkName, String sex, String zhiwei, String officePhone,
			String phone) {
		super();
		this.id = id;
		this.cusId = cusId;
		this.linkName = linkName;
		this.sex = sex;
		this.zhiwei = zhiwei;
		this.officePhone = officePhone;
		this.phone = phone;
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
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getZhiwei() {
		return zhiwei;
	}
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CustomerLinkman [id=" + id + ", cusId=" + cusId + ", linkName=" + linkName + ", sex=" + sex
				+ ", zhiwei=" + zhiwei + ", officePhone=" + officePhone + ", phone=" + phone + "]";
	}
	
}
