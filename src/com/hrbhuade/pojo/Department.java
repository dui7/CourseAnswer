package com.hrbhuade.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer departmentNo;
	private String departmentName;
	private Integer parentId;
	private Set teachersoffices = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department(Integer departmentNo) {
		this.departmentNo = departmentNo;
	}
	public Department(Integer departmentNo,String departmentName) {
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
	}
	
	/** full constructor */
	public Department(String departmentName, Integer parentId,
			Set teachersoffices) {
		this.departmentName = departmentName;
		this.parentId = parentId;
		this.teachersoffices = teachersoffices;
	}

	// Property accessors

	public Integer getDepartmentNo() {
		return this.departmentNo;
	}

	public void setDepartmentNo(Integer departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Set getTeachersoffices() {
		return this.teachersoffices;
	}

	public void setTeachersoffices(Set teachersoffices) {
		this.teachersoffices = teachersoffices;
	}

}