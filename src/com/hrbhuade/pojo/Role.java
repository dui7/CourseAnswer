package com.hrbhuade.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String authIds;
	private String description;
	private Set adminUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(String roleName) {
		this.roleName = roleName;
	}

	/** full constructor */
	public Role(String roleName, String authIds, String description,
			Set adminUsers) {
		this.roleName = roleName;
		this.authIds = authIds;
		this.description = description;
		this.adminUsers = adminUsers;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getAuthIds() {
		return this.authIds;
	}

	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getAdminUsers() {
		return this.adminUsers;
	}

	public void setAdminUsers(Set adminUsers) {
		this.adminUsers = adminUsers;
	}

}