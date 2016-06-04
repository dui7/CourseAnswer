package com.hrbhuade.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private String teacherUser;
	private Teachersoffice teachersoffice;
	private Notice notice;
	private String teacherPassword;
	private String teacherName;
	private String teacherIco;
	private String teacherSex;
	private String teacherEmail;
	private String begoodat;
	private Set teachs = new HashSet(0);
	private Set evaluates = new HashSet(0);
	private Set answercontents = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	public Teacher(String teacherUser) {
		this.teacherUser = teacherUser;
	}
	public Teacher(String teacherUser, String teacherPassword, String teacherName) {
		this.teacherUser = teacherUser;
		this.teacherPassword = teacherPassword;
		this.teacherName = teacherName;
	}
	
	
	/** minimal constructor */
	public Teacher(String teacherUser, String teacherPassword) {
		this.teacherUser = teacherUser;
		this.teacherPassword = teacherPassword;
		
	}

	/** full constructor */
	public Teacher(String teacherUser, Teachersoffice teachersoffice,
			Notice notice, String teacherPassword, String teacherName,
			String teacherIco, String teacherSex, String teacherEmail,
			String begoodat, Set teachs, Set evaluates, Set answercontents) {
		this.teacherUser = teacherUser;
		this.teachersoffice = teachersoffice;
		this.notice = notice;
		this.teacherPassword = teacherPassword;
		this.teacherName = teacherName;
		this.teacherIco = teacherIco;
		this.teacherSex = teacherSex;
		this.teacherEmail = teacherEmail;
		this.begoodat = begoodat;
		this.teachs = teachs;
		this.evaluates = evaluates;
		this.answercontents = answercontents;
	}

	// Property accessors

	public String getTeacherUser() {
		return this.teacherUser;
	}

	public void setTeacherUser(String teacherUser) {
		this.teacherUser = teacherUser;
	}

	public Teachersoffice getTeachersoffice() {
		return this.teachersoffice;
	}

	public void setTeachersoffice(Teachersoffice teachersoffice) {
		this.teachersoffice = teachersoffice;
	}

	public Notice getNotice() {
		return this.notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public String getTeacherPassword() {
		return this.teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherIco() {
		return this.teacherIco;
	}

	public void setTeacherIco(String teacherIco) {
		this.teacherIco = teacherIco;
	}

	public String getTeacherSex() {
		return this.teacherSex;
	}

	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}

	public String getTeacherEmail() {
		return this.teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getBegoodat() {
		return this.begoodat;
	}

	public void setBegoodat(String begoodat) {
		this.begoodat = begoodat;
	}

	public Set getTeachs() {
		return this.teachs;
	}

	public void setTeachs(Set teachs) {
		this.teachs = teachs;
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