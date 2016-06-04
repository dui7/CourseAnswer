package com.hrbhuade.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String studentUser;
	private String studentPassword;
	private String studentName;
	private String answerContentNo;
	private String studentEmail;
	private String studentSex;
	private String studentIco;
	private Set evaluates = new HashSet(0);
	private Set answercontents = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String studentUser) {
		this.studentUser = studentUser;
	}

	
	public Student(String studentUser, String studentPassword,
			String studentName) {
		this.studentUser = studentUser;
		this.studentPassword = studentPassword;
		this.studentName = studentName;
	}
	/** full constructor */
	public Student(String studentUser, String studentPassword,
			String studentName, String answerContentNo, String studentEmail,
			String studentSex, String studentIco, Set evaluates,
			Set answercontents) {
		this.studentUser = studentUser;
		this.studentPassword = studentPassword;
		this.studentName = studentName;
		this.answerContentNo = answerContentNo;
		this.studentEmail = studentEmail;
		this.studentSex = studentSex;
		this.studentIco = studentIco;
		this.evaluates = evaluates;
		this.answercontents = answercontents;
	}

	// Property accessors

	public String getStudentUser() {
		return this.studentUser;
	}

	public void setStudentUser(String studentUser) {
		this.studentUser = studentUser;
	}

	public String getStudentPassword() {
		return this.studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAnswerContentNo() {
		return this.answerContentNo;
	}

	public void setAnswerContentNo(String answerContentNo) {
		this.answerContentNo = answerContentNo;
	}

	public String getStudentEmail() {
		return this.studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentSex() {
		return this.studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public String getStudentIco() {
		return this.studentIco;
	}

	public void setStudentIco(String studentIco) {
		this.studentIco = studentIco;
	}

	public Set getEvaluates() {
		return this.evaluates;
	}

	public void setEvaluates(Set evaluates) {
		this.evaluates = evaluates;
	}

	public Set getAnswercontents() {
		return this.answercontents;
	}

	public void setAnswercontents(Set answercontents) {
		this.answercontents = answercontents;
	}

}