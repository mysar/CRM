package change.crm.util;


import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 * 
 * @author change 时间:2016-11-18 上午11:19:00 说明:TODO
 */
public class Paging<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 当前页
	public int page;
	// 总页数
	public int pages;
	// 每页显示的数量
	public int pageSize;
	// 总记录数
	public int total;

	// 开始记录
	public int startRecorder;
	// 结束记录
	public int endRecorder;

	// 每页显示记录 存储到List集合中
	public List<T> rows;

	public Paging() {
		super();
	}

	/**
	 * 传递三个参数
	 * 
	 * @param page
	 *            当前页
	 * @param pageSize
	 *            每页显示数量
	 * @param total
	 *            总记录数
	 */
	public Paging(int page, int pageSize, int total) {
		super();
		// 每页显示数量
		this.pageSize = pageSize;
		// 总记录数
		this.total = total;

		// 根据总记录数，每页显示数量，来计算总页数
		this.pages = this.total % this.pageSize == 0 ? this.total / this.pageSize : this.total / this.pageSize + 1;

		// 判断当前页
		if (page <= 1) {
			this.page = 1;
		} else if (page >= this.pages) {
			this.page = pages;
		} else {
			this.page = page;
		}

		// 计算出 每页开始的记录和结束的记录
		this.startRecorder = (this.page - 1) * this.pageSize;
		this.endRecorder = (this.page - 1) * this.pages + this.pageSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getStartRecorder() {
		return startRecorder;
	}

	public void setStartRecorder(int startRecorder) {
		this.startRecorder = startRecorder;
	}

	public int getEndRecorder() {
		return endRecorder;
	}

	public void setEndRecorder(int endRecorder) {
		this.endRecorder = endRecorder;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "Paging [page=" + page + ", pages=" + pages + ", pageSize=" + pageSize + ", total=" + total
				+ ", startRecorder=" + startRecorder + ", endRecorder=" + endRecorder + ", rows=" + rows + "]";
	}

}
