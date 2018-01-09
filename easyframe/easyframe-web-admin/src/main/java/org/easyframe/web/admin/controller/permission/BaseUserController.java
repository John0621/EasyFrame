package org.easyframe.web.admin.controller.permission;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.easyframe.domain.permission.TBaseUser;
import org.easyframe.domain.utils.Pagination;
import org.easyframe.domain.utils.ResultObject;
import org.easyframe.service.permission.BaseUserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;

/**
 * 基础用户管理 控制层
 * @author liutzh
 *
 */
@Controller
@RequestMapping(value="/user")
public class BaseUserController {

	@Autowired
	private BaseUserServiceI userService;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String login(String loginname,String password,String callback) {
		TBaseUser userA = new TBaseUser();
		TBaseUser userB = new TBaseUser();
		userA.setLoginname("test1");
		userB.setLoginname("test2");
		Pagination page = new Pagination();
		page.setPagecount(10);
		page.setPagecur(2);
		page.setTotalnum(96);
		page.setPagenum(3);
		page.setPagesize(10);
		List<TBaseUser> userlist = new ArrayList<TBaseUser>();
		userlist.add(userA);
		userlist.add(userB);
		ResultObject<TBaseUser> ro = new ResultObject<>();
		ro.setList(userlist);
		ro.setPageinfo(page);
		JSONObject json = JSONObject.fromObject(ro);
		
//		String result =
		String result = callback + "("+json.toString()+")"; 
		return result;
	}
	
	@RequestMapping(value="/query")
	@ResponseBody
	public String query(String loginname,String username,String callback) {
		TBaseUser userA = new TBaseUser();
		TBaseUser userB = new TBaseUser();
		userA.setId(1001L);
		userA.setLoginname("test1");
		userA.setUsername("liutzh1");
		userA.setUsermark("mark 1");
		userA.setUservalid("yes");
		userA.setCreatedate(new Date());
		
		userB.setId(1002L);
		userB.setLoginname("test2");
		userB.setUsername("liutzh2");
		userB.setUsermark("mark 2");
		userB.setUservalid("yes");
		userB.setCreatedate(new Date());
		
		Pagination page = new Pagination();
		page.setPagecount(10);
		page.setPagecur(2);
		page.setTotalnum(96);
		page.setPagenum(3);
		page.setPagesize(10);
		List<TBaseUser> userlist = new ArrayList<TBaseUser>();
		userlist.add(userA);
		userlist.add(userB);
		ResultObject<TBaseUser> ro = new ResultObject<>();
		ro.setList(userlist);
		ro.setPageinfo(page);
		JSONObject json = JSONObject.fromObject(ro);
		
//		String result =
		String result = callback + "("+json.toString()+")"; 
		return result;
	}
}
