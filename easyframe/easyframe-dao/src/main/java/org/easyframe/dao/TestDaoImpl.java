package org.easyframe.dao;

import java.util.List;

import org.easyframe.domain.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImpl implements TestDao {

	@Autowired
	@Qualifier("sqlSession")
	private SqlSessionTemplate sqlSession;

	@SuppressWarnings("unchecked")
	@Override
	public List<Test> getListTest() {
		return (List<Test>) sqlSession.selectList("testMapper.getListTest");
	}

}
