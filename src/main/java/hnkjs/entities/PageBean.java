package hnkjs.entities;

import java.util.List;

public class PageBean<T> extends BaseEntity {
	
	private static final long serialVersionUID = -6768810179652120695L;
	/** 总记录数 */
	private int total;
	/** 分页结果 */
	private List<T> data;
	/** 开始页码 */
	private int start;
	/** 每页多少 */
	private int limit;
	/** 查询条件 */
	private String wheres;
	/**状态*/
	private boolean presentstate; //某个状态
    
	private int currentPage; // 当前页
	private int offset;     //当前记录起始索引     LiMIT offset , pagesize
	private int totalPage; // 总页数
	
	
	public boolean getPresentstate() {
		return presentstate;
	}

	public void setPresentstate(boolean presentstate) {
		this.presentstate = presentstate;
	}

	

	public int getCurrentPage() {
		if (currentPage <= 0)
			currentPage = 1;
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getOffset() {
		offset = (getCurrentPage() - 1) * getLimit();
		if (offset < 0)
			offset = 0;
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getTotalPage() {
		if (total % limit == 0)
			totalPage = total / limit;
		else
			totalPage = total / limit + 1;
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getWheres() {
		return wheres;
	}

	public void setWheres(String wheres) {
		this.wheres = wheres;
	}

	@Override
	public String toString() {
		return start + " " + total + " " + data;
	}

}
