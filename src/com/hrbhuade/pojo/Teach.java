package com.hrbhuade.pojo;

/**
 * Teach entity. @author MyEclipse Persistence Tools
 */

public class Teach implements java.io.Serializable {

	// Fields

	private Integer teachId;
	private Teacher teacher;
	private Courses courses;

	// Constructors

	/** default constructor */
	public Teach() {
	}

	/** full constructor */
	public Teach(Teacher teacher, Courses courses) {
		this.teacher = teacher;
		this.courses = courses;
	}

	// Property accessors

	public Integer getTeachId() {
		return this.teachId;
	}

	public void setTeachId(Integer teachId) {
		this.teachId = teachId;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Courses getCourses() {
		return this.courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

}