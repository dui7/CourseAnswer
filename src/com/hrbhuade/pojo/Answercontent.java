package com.hrbhuade.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Answercontent entity. @author MyEclipse Persistence Tools
 */

public class Answercontent implements java.io.Serializable {

	// Fields

	private Integer answerContentNo;
	private Teacher teacher;
	private Student student;
	private String answerContentTitle;
	private Timestamp answerContentOrderdate;
	private Timestamp answerContentAnswerdate;
	private Integer answerContentOrdersuccess;
	private String answerContentContent;
	private Integer nswerContentRead;
	private Set evaluates = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Answercontent() {
	}

	/** minimal constructor */
	public Answercontent(String answerContentTitle,
			Timestamp answerContentOrderdate,
			Integer answerContentOrdersuccess, Integer nswerContentRead) {
		this.answerContentTitle = answerContentTitle;
		this.answerContentOrderdate = answerContentOrderdate;
		this.answerContentOrdersuccess = answerContentOrdersuccess;
		this.nswerContentRead = nswerContentRead;
	}

	/** full constructor */
	public Answercontent(Teacher teacher, Student student,
			String answerContentTitle, Timestamp answerContentOrderdate,
			Timestamp answerContentAnswerdate,
			Integer answerContentOrdersuccess, String answerContentContent,
			Integer nswerContentRead, Set evaluates, Set comments) {
		this.teacher = teacher;
		this.student = student;
		this.answerContentTitle = answerContentTitle;
		this.answerContentOrderdate = answerContentOrderdate;
		this.answerContentAnswerdate = answerContentAnswerdate;
		this.answerContentOrdersuccess = answerContentOrdersuccess;
		this.answerContentContent = answerContentContent;
		this.nswerContentRead = nswerContentRead;
		this.evaluates = evaluates;
		this.comments = comments;
	}

	// Property accessors

	public Integer getAnswerContentNo() {
		return this.answerContentNo;
	}

	public void setAnswerContentNo(Integer answerContentNo) {
		this.answerContentNo = answerContentNo;
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

	public String getAnswerContentTitle() {
		return this.answerContentTitle;
	}

	public void setAnswerContentTitle(String answerContentTitle) {
		this.answerContentTitle = answerContentTitle;
	}

	public Timestamp getAnswerContentOrderdate() {
		return this.answerContentOrderdate;
	}

	public void setAnswerContentOrderdate(Timestamp answerContentOrderdate) {
		this.answerContentOrderdate = answerContentOrderdate;
	}

	public Timestamp getAnswerContentAnswerdate() {
		return this.answerContentAnswerdate;
	}

	public void setAnswerContentAnswerdate(Timestamp answerContentAnswerdate) {
		this.answerContentAnswerdate = answerContentAnswerdate;
	}

	public Integer getAnswerContentOrdersuccess() {
		return this.answerContentOrdersuccess;
	}

	public void setAnswerContentOrdersuccess(Integer answerContentOrdersuccess) {
		this.answerContentOrdersuccess = answerContentOrdersuccess;
	}

	public String getAnswerContentContent() {
		return this.answerContentContent;
	}

	public void setAnswerContentContent(String answerContentContent) {
		this.answerContentContent = answerContentContent;
	}

	public Integer getNswerContentRead() {
		return this.nswerContentRead;
	}

	public void setNswerContentRead(Integer nswerContentRead) {
		this.nswerContentRead = nswerContentRead;
	}

	public Set getEvaluates() {
		return this.evaluates;
	}

	public void setEvaluates(Set evaluates) {
		this.evaluates = evaluates;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}