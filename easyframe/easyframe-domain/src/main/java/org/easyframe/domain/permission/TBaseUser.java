package org.easyframe.domain.permission;

import java.io.Serializable;
import java.util.Date;

/**
 * 登陆用户基础类
 * 
 * @author liutzh
 *
 */
public class TBaseUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1261295701871645313L;
	/**
	 * 登陆用id
	 * 
	 */
	private Long id;
	/**
	 * 登陆账号
	 */
	private String loginname;
	/**
	 * 登陆密码
	 */
	private String password;
	/**
	 * 登陆用户名
	 */
	private String username;
	/**
	 * 用户标识
	 */
	private String usermark;
	/**
	 * 有效标识
	 */
	private String uservalid;
	/**
	 * 创建时间
	 */
	private Date createdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsermark() {
		return usermark;
	}

	public void setUsermark(String usermark) {
		this.usermark = usermark;
	}

	public String getUservalid() {
		return uservalid;
	}

	public void setUservalid(String uservalid) {
		this.uservalid = uservalid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}
