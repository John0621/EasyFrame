package org.easyframe.service.permission.impl;

import java.util.List;

import org.easyframe.dao.permission.BaseUserDao;
import org.easyframe.domain.permission.TBaseUser;
import org.easyframe.service.permission.BaseUserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements BaseUserServiceI {

	@Autowired
	private BaseUserDao baseUserDao;
	@Override
	public List<TBaseUser> getUserList() {
		List<TBaseUser> userlist = baseUserDao.getUserList();
		return userlist;
	}

}
