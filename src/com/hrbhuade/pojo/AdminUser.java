package com.hrbhuade.pojo;

/**
 * AdminUser entity. @author MyEclipse Persistence Tools
 */

public class AdminUser implements java.io.Serializable {

	// Fields

	private String adminUser;
	private Role role;
	private String adminPassword;
	private String adminName;

	// Constructors

	/** default constructor */
	public AdminUser() {
	}

	/** minimal constructor */
	public AdminUser(String adminUser) {
		this.adminUser = adminUser;
	}

	/** full constructor */
	public AdminUser(String adminUser, Role role, String adminPassword,
			String adminName) {
		this.adminUser = adminUser;
		this.role = role;
		this.adminPassword = adminPassword;
		this.adminName = adminName;
	}

	// Property accessors

	public String getAdminUser() {
		return this.adminUser;
	}

	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

}