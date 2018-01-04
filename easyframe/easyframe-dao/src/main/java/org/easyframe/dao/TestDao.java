package org.easyframe.dao;

import java.util.List;

import org.easyframe.domain.Test;

public interface TestDao {
	/**
	 * 获取用户列表
	 * */
	List<Test> getListTest();
}
