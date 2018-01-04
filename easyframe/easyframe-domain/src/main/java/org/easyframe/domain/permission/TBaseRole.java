package org.easyframe.domain.permission;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 权限基本表
 * 
 * @author liutzh
 *
 */
public class TBaseRole implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6836476773308880480L;
	/**
	 * 角色id
	 */
	private Long id;
	/**
	 * 父节点id
	 */
	private Long pid;
	/**
	 * 角色名称
	 */
	private String rolename;
	/**
	 * 角色概述
	 */
	private String roleverview;
	/**
	 * 角色标识
	 */
	private String rolemark;
	/**
	 * 角色级别
	 */
	private String rolelvl;
	/**
	 * 有效标识
	 */
	private String rolevalid;
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
	
	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoleverview() {
		return roleverview;
	}

	public void setRoleverview(String roleverview) {
		this.roleverview = roleverview;
	}

	public String getRolemark() {
		return rolemark;
	}

	public void setRolemark(String rolemark) {
		this.rolemark = rolemark;
	}

	public String getRolelvl() {
		return rolelvl;
	}

	public void setRolelvl(String rolelvl) {
		this.rolelvl = rolelvl;
	}

	public String getRolevalid() {
		return rolevalid;
	}

	public void setRolevalid(String rolevalid) {
		this.rolevalid = rolevalid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}
