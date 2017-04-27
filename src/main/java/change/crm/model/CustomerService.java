package change.crm.model;

import java.io.Serializable;
import java.util.Date;

//客户服务实体表
public class CustomerService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String serveType;
	private String overview;
	private String customer;
	private String state;
	private String servicerequest;
	private String createPeople;
	private Date createTime;
	private String assigner;
	private Date assignTime;
	private String serviceProce;
	private String serviceProcePeople;
	private Date serviceProceTime;
	private String serviceProceResult;
	private String myd;

	public CustomerService() {
		super();
	}

	public CustomerService(Integer id, String serveType, String overview, String customer, String state,
			String servicerequest, String createPeople, Date createTime, String assigner, Date assignTime,
			String serviceProce, String serviceProcePeople, Date serviceProceTime, String serviceProceResult,
			String myd) {
		super();
		this.id = id;
		this.serveType = serveType;
		this.overview = overview;
		this.customer = customer;
		this.state = state;
		this.servicerequest = servicerequest;
		this.createPeople = createPeople;
		this.createTime = createTime;
		this.assigner = assigner;
		this.assignTime = assignTime;
		this.serviceProce = serviceProce;
		this.serviceProcePeople = serviceProcePeople;
		this.serviceProceTime = serviceProceTime;
		this.serviceProceResult = serviceProceResult;
		this.myd = myd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServeType() {
		return serveType;
	}

	public void setServeType(String serveType) {
		this.serveType = serveType;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getServicerequest() {
		return servicerequest;
	}

	public void setServicerequest(String servicerequest) {
		this.servicerequest = servicerequest;
	}

	public String getCreatePeople() {
		return createPeople;
	}

	public void setCreatePeople(String createPeople) {
		this.createPeople = createPeople;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAssigner() {
		return assigner;
	}

	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}

	public Date getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public String getServiceProce() {
		return serviceProce;
	}

	public void setServiceProce(String serviceProce) {
		this.serviceProce = serviceProce;
	}

	public String getServiceProcePeople() {
		return serviceProcePeople;
	}

	public void setServiceProcePeople(String serviceProcePeople) {
		this.serviceProcePeople = serviceProcePeople;
	}

	public Date getServiceProceTime() {
		return serviceProceTime;
	}

	public void setServiceProceTime(Date serviceProceTime) {
		this.serviceProceTime = serviceProceTime;
	}

	public String getServiceProceResult() {
		return serviceProceResult;
	}

	public void setServiceProceResult(String serviceProceResult) {
		this.serviceProceResult = serviceProceResult;
	}

	public String getMyd() {
		return myd;
	}

	public void setMyd(String myd) {
		this.myd = myd;
	}

	@Override
	public String toString() {
		return "CustomService [id=" + id + ", serveType=" + serveType + ", overview=" + overview + ", customer="
				+ customer + ", state=" + state + ", servicerequest=" + servicerequest + ", createPeople="
				+ createPeople + ", createTime=" + createTime + ", assigner=" + assigner + ", assignTime=" + assignTime
				+ ", serviceProce=" + serviceProce + ", serviceProcePeople=" + serviceProcePeople
				+ ", serviceProceTime=" + serviceProceTime + ", serviceProceResult=" + serviceProceResult + ", myd="
				+ myd + "]";
	}

}
