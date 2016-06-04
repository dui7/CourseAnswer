package com.hrbhuade.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Teachersoffice entity. @author MyEclipse Persistence Tools
 */

public class Teachersoffice implements java.io.Serializable {

	// Fields

	private Integer teacherOfficeId;
	private Department department;
	private String teachersOfficeName;
	private Set teachers = new HashSet(0);
	private Set courseses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teachersoffice() {
	}


	/** full constructor */
	public Teachersoffice(Department department, String teachersOfficeName,
			Set teachers, Set courseses) {
		this.department = department;
		this.teachersOfficeName = teachersOfficeName;
		this.teachers = teachers;
		this.courseses = courseses;
	}

	// Property accessors

	public Integer getTeacherOfficeId() {
		return this.teacherOfficeId;
	}

	public void setTeacherOfficeId(Integer teacherOfficeId) {
		this.teacherOfficeId = teacherOfficeId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getTeachersOfficeName() {
		return this.teachersOfficeName;
	}

	public void setTeachersOfficeName(String teachersOfficeName) {
		this.teachersOfficeName = teachersOfficeName;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

	public Set getCourseses() {
		return this.courseses;
	}

	public void setCourseses(Set courseses) {
		this.courseses = courseses;
	}

}