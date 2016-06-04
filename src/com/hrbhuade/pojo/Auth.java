package com.hrbhuade.pojo;

/**
 * Auth entity. @author MyEclipse Persistence Tools
 */

public class Auth implements java.io.Serializable {

	// Fields

	private Integer authId;
	private String authName;
	private String authPath;
	private Integer parentId;
	private String state;
	private String iconCls;

	// Constructors

	/** default constructor */
	public Auth() {
	}

	/** minimal constructor */
	public Auth(String authName) {
		this.authName = authName;
	}

	/** full constructor */
	public Auth(String authName, String authPath, Integer parentId,
			String state, String iconCls) {
		this.authName = authName;
		this.authPath = authPath;
		this.parentId = parentId;
		this.state = state;
		this.iconCls = iconCls;
	}

	// Property accessors

	public Integer getAuthId() {
		return this.authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return this.authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthPath() {
		return this.authPath;
	}

	public void setAuthPath(String authPath) {
		this.authPath = authPath;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return this.iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

}