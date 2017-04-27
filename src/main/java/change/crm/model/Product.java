package change.crm.model;

/**
 * 
 * @author delll
 *
 */
public class Product {
	private Integer id; // 编号
	private String productName; // 产品名称
	private String model; //型号
	private String unit; // 单位
	private Float price; // 价格
	private Integer store; // 库存
	private String remark; // 备注ע
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getStore() {
		return store;
	}
	public void setStore(Integer store) {
		this.store = store;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", model=" + model + ", unit=" + unit + ", price="
				+ price + ", store=" + store + ", remark=" + remark + "]";
	}
	
}
