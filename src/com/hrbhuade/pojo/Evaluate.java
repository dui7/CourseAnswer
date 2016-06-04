package com.hrbhuade.pojo;

/**
 * Evaluate entity. @author MyEclipse Persistence Tools
 */

public class Evaluate implements java.io.Serializable {

	// Fields

	private Integer evaluateNo;
	private Teacher teacher;
	private Student student;
	private Answercontent answercontent;
	private String evaluateContent;

	// Constructors

	/** default constructor */
	public Evaluate() {
	}

	/** minimal constructor */
	public Evaluate(Integer evaluateNo) {
		this.evaluateNo = evaluateNo;
	}

	/** full constructor */
	public Evaluate(Integer evaluateNo, Teacher teacher, Student student,
			Answercontent answercontent, String evaluateContent) {
		this.evaluateNo = evaluateNo;
		this.teacher = teacher;
		this.student = student;
		this.answercontent = answercontent;
		this.evaluateContent = evaluateContent;
	}

	// Property accessors

	public Integer getEvaluateNo() {
		return this.evaluateNo;
	}

	public void setEvaluateNo(Integer evaluateNo) {
		this.evaluateNo = evaluateNo;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Answercontent getAnswercontent() {
		return this.answercontent;
	}

	public void setAnswercontent(Answercontent answercontent) {
		this.answercontent = answercontent;
	}

	public String getEvaluateContent() {
		return this.evaluateContent;
	}

	public void setEvaluateContent(String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}

}