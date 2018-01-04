package org.easyframe.service;

import java.util.List;

import org.easyframe.dao.TestDaoImpl;
import org.easyframe.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDaoImpl testDao;

	@Override
	public List<Test> getListTest() {
		return testDao.getListTest();
	}

}
