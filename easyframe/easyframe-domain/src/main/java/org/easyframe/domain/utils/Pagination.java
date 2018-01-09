package org.easyframe.domain.utils;

/**
 * 分页
 * 
 * @author liutzh
 *
 */
public class Pagination {

	/**
	 * 页容量
	 */
	private int pagesize;
	/**
	 * 页数
	 */
	private int pagenum;
	/**
	 * 总条数
	 */
	private int totalnum;
	/**
	 * 总页数
	 */
	private int pagecount;
	/**
	 * 当前页码
	 */
	private int pagecur;

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public int getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}

	public int getPagecur() {
		return pagecur;
	}

	public void setPagecur(int pagecur) {
		this.pagecur = pagecur;
	}

}
