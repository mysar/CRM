package change.crm.model;

import java.io.Serializable;

public class Customerreprieve implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer lossId;
	private String measure;
	public Customerreprieve() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customerreprieve(Integer id, Integer lossId, String measure) {
		super();
		this.id = id;
		this.lossId = lossId;
		this.measure = measure;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLossId() {
		return lossId;
	}
	public void setLossId(Integer lossId) {
		this.lossId = lossId;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	@Override
	public String toString() {
		return "Customerreprieve [id=" + id + ", lossId=" + lossId + ", measure=" + measure + "]";
	}
	
}
