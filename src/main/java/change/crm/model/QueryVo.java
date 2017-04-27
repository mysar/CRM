package change.crm.model;

public class QueryVo<T> {

	private T entity;
	private Integer startSize;
	private Integer pageSize;
	private String sort;
	private String desc;

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public Integer getStartSize() {
		return startSize;
	}

	public void setStartSize(Integer startSize) {
		this.startSize = startSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
