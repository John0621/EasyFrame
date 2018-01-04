package org.easyframe.dao.permission.impl;

import java.util.List;

import org.easyframe.dao.permission.BaseUserDao;
import org.easyframe.domain.permission.TBaseUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("baseUserDao")
public class BaseUserDaoImpl implements BaseUserDao {

	@Autowired
	@Qualifier("sqlSession")
	private SqlSessionTemplate sqlSession;

	@SuppressWarnings("unchecked")
	@Override
	public List<TBaseUser> getUserList() {
		return (List<TBaseUser>)sqlSession.selectList("tBaseUserMapper.getUserList");
	}

}
