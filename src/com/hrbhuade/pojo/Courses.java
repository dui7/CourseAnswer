package com.hrbhuade.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Courses entity. @author MyEclipse Persistence Tools
 */

public class Courses implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private Teachersoffice teachersoffice;
	private String courseName;
	private Set teachs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Courses() {
	}

	/** minimal constructor */
	public Courses(String courseName) {
		this.courseName = courseName;
	}
	public Courses(Integer courseId) {
		this.courseId = courseId;
	}
	public Courses(Integer courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	/** full constructor */
	public Courses(Teachersoffice teachersoffice, String courseName, Set teachs) {
		this.teachersoffice = teachersoffice;
		this.courseName = courseName;
		this.teachs = teachs;
	}

	// Property accessors

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Teachersoffice getTeachersoffice() {
		return this.teachersoffice;
	}

	public void setTeachersoffice(Teachersoffice teachersoffice) {
		this.teachersoffice = teachersoffice;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set getTeachs() {
		return this.teachs;
	}

	public void setTeachs(Set teachs) {
		this.teachs = teachs;
	}

}