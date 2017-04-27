package change.crm.model;

public class OrderDetails {

	private Integer id; // 编号
	private Integer orderId; // 所属订单
	private String goodsName; // 商品名称
	private int goodsNum; // 商品数量
	private String unit; // 单位
	private float price; // 价格
	private float sum; // 总金额
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(Integer id, Integer orderId, String goodsName, int goodsNum, String unit, float price,
			float sum) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.unit = unit;
		this.price = price;
		this.sum = sum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderId=" + orderId + ", goodsName=" + goodsName + ", goodsNum=" + goodsNum
				+ ", unit=" + unit + ", price=" + price + ", sum=" + sum + "]";
	}
	
}
