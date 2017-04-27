package change.crm.model;

import java.util.Date;

public class CustomerLoss {

	private Integer id; // 编号
	private String cusNo; // 客户编号
	private String cusName; // 客户名称
	private String cusManager; // 客户经理
	private Date lastOrderTime; // 上次下单日期
	private Date confirmLossTime; // 确认流失日期
	private Integer state; // 状态 0 暂缓流失 1 确认流失
	private String lossReason; // 流失原因
	public CustomerLoss() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLoss(Integer id, String cusNo, String cusName, String cusManager, Date lastOrderTime,
			Date confirmLossTime, Integer state, String lossReason) {
		super();
		this.id = id;
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.cusManager = cusManager;
		this.lastOrderTime = lastOrderTime;
		this.confirmLossTime = confirmLossTime;
		this.state = state;
		this.lossReason = lossReason;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCusNo() {
		return cusNo;
	}
	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusManager() {
		return cusManager;
	}
	public void setCusManager(String cusManager) {
		this.cusManager = cusManager;
	}
	public Date getLastOrderTime() {
		return lastOrderTime;
	}
	public void setLastOrderTime(Date lastOrderTime) {
		this.lastOrderTime = lastOrderTime;
	}
	public Date getConfirmLossTime() {
		return confirmLossTime;
	}
	public void setConfirmLossTime(Date confirmLossTime) {
		this.confirmLossTime = confirmLossTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getLossReason() {
		return lossReason;
	}
	public void setLossReason(String lossReason) {
		this.lossReason = lossReason;
	}
	@Override
	public String toString() {
		return "CustomerLoss [id=" + id + ", cusNo=" + cusNo + ", cusName=" + cusName + ", cusManager=" + cusManager
				+ ", lastOrderTime=" + lastOrderTime + ", confirmLossTime=" + confirmLossTime + ", state=" + state
				+ ", lossReason=" + lossReason + "]";
	}
	
}
