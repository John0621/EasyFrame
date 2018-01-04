package org.easyframe.domain.permission;

import java.io.Serializable;
import java.util.Date;

public class TBaseResources implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6889249228887300765L;

	private Long id;
	private String resname;
	private String resoverview;
	private String resmark;
	private String resurl;
	private String resvalid;
	private Integer reslvl;
	private Long pid;
	private Date createdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResname() {
		return resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public String getResoverview() {
		return resoverview;
	}

	public void setResoverview(String resoverview) {
		this.resoverview = resoverview;
	}

	public String getResmark() {
		return resmark;
	}

	public void setResmark(String resmark) {
		this.resmark = resmark;
	}

	public String getResurl() {
		return resurl;
	}

	public void setResurl(String resurl) {
		this.resurl = resurl;
	}

	public String getResvalid() {
		return resvalid;
	}

	public void setResvalid(String resvalid) {
		this.resvalid = resvalid;
	}

	public Integer getReslvl() {
		return reslvl;
	}

	public void setReslvl(Integer reslvl) {
		this.reslvl = reslvl;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}
