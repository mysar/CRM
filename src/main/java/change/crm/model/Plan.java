package change.crm.model;

import java.io.Serializable;
import java.util.Date;

public class Plan  implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;        // 编号
	private Chance saleChance; // 销售机会
	private String planItem;   // 计划项
	private Date planDate;     // 计划日期
	private String exeAffect;  // 执行效果
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(Integer id, Chance saleChance, String planItem, Date planDate, String exeAffect) {
		super();
		this.id = id;
		this.saleChance = saleChance;
		this.planItem = planItem;
		this.planDate = planDate;
		this.exeAffect = exeAffect;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Chance getSaleChance() {
		return saleChance;
	}
	public void setSaleChance(Chance saleChance) {
		this.saleChance = saleChance;
	}
	public String getPlanItem() {
		return planItem;
	}
	public void setPlanItem(String planItem) {
		this.planItem = planItem;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public String getExeAffect() {
		return exeAffect;
	}
	public void setExeAffect(String exeAffect) {
		this.exeAffect = exeAffect;
	}
	
	@Override
	public String toString() {
		return "Plan [id=" + id + ", saleChance=" + saleChance + ", planItem=" + planItem + ", planDate=" + planDate
				+ ", exeAffect=" + exeAffect + "]";
	}
}
