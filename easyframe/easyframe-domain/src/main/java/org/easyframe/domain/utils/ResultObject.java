package org.easyframe.domain.utils;

import java.util.List;

/**
 * 结果集 
 * @author liutzh
 *
 * @param <T>
 */
public class ResultObject<T> {

	private Pagination pageinfo;
	private List<T> list;

	public Pagination getPageinfo() {
		return pageinfo;
	}

	public void setPageinfo(Pagination pageinfo) {
		this.pageinfo = pageinfo;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
