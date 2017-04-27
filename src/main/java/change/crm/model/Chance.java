package change.crm.model;

import java.io.Serializable;
import java.util.Date;
/***
 * 销售机会表
 * @author Mr.Yan
 * 时间:2017-04-20上午11:13:03
 * 说明:TODO
 */
public class Chance implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected Integer id;          //编号
	protected String chanceSource; //机会来源
	protected String customerName; //客户名称（客户公司）
	protected Integer cgjl;        //成功几率
	protected String overview;     //概要
	protected String linkMan;      //联系人
	protected String linkPhone;    //联系电话
	protected String description;  //机会描述
	protected String createMan;    //创建人
	protected Date createTime;     //创建时间
	protected String assignMan;    //指派人
	protected Date assignTime;     //指派时间
	protected Integer state;       //分配状态（ 0 未分配 1 已分配）
	protected Integer devResult;   //客户开发状态 （0 未开发 1 开发中 2 开发成功 3 开发失败）
	public Chance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chance(Integer id, String chanceSource, String customerName, Integer cgjl, String overview, String linkMan,
			String linkPhone, String description, String createMan, Date createTime, String assignMan, Date assignTime,
			Integer state, Integer devResult) {
		super();
		this.id = id;
		this.chanceSource = chanceSource;
		this.customerName = customerName;
		this.cgjl = cgjl;
		this.overview = overview;
		this.linkMan = linkMan;
		this.linkPhone = linkPhone;
		this.description = description;
		this.createMan = createMan;
		this.createTime = createTime;
		this.assignMan = assignMan;
		this.assignTime = assignTime;
		this.state = state;
		this.devResult = devResult;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChanceSource() {
		return chanceSource;
	}
	public void setChanceSource(String chanceSource) {
		this.chanceSource = chanceSource;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCgjl() {
		return cgjl;
	}
	public void setCgjl(Integer cgjl) {
		this.cgjl = cgjl;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateMan() {
		return createMan;
	}
	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getAssignMan() {
		return assignMan;
	}
	public void setAssignMan(String assignMan) {
		this.assignMan = assignMan;
	}
	public Date getAssignTime() {
		return assignTime;
	}
	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getDevResult() {
		return devResult;
	}
	public void setDevResult(Integer devResult) {
		this.devResult = devResult;
	}

	@Override
	public String toString() {
		return "Chance [id=" + id + ", chanceSource=" + chanceSource + ", customerName=" + customerName + ", cgjl="
				+ cgjl + ", overview=" + overview + ", linkMan=" + linkMan + ", linkPhone=" + linkPhone
				+ ", description=" + description + ", createMan=" + createMan + ", createTime=" + createTime
				+ ", assignMan=" + assignMan + ", assignTime=" + assignTime + ", state=" + state + ", devResult="
				+ devResult + "]";
	}	
}
