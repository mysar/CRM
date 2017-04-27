package change.crm.model;

import java.io.Serializable;
/**
 * 数据字典实体表
 * @author Mr.Yans
 */
public class Datadic implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected Integer id;          //主键id
	protected String dataDicName;  //数据字典名称
	protected String dataDicValue; //数据字典值
	
	public Datadic() {
		super();
	}
	public Datadic(Integer id, String dataDicName, String dataDicValue) {
		super();
		this.id = id;
		this.dataDicName = dataDicName;
		this.dataDicValue = dataDicValue;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDataDicName() {
		return dataDicName;
	}
	public void setDataDicName(String dataDicName) {
		this.dataDicName = dataDicName;
	}
	public String getDataDicValue() {
		return dataDicValue;
	}
	public void setDataDicValue(String dataDicValue) {
		this.dataDicValue = dataDicValue;
	}
	@Override
	public String toString() {
		return "dsadasd [id=" + id + ", dataDicName=" + dataDicName + ", dataDicValue=" + dataDicValue + "]";
	}	
}
