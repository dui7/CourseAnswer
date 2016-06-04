package com.hrbhuade.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Integer noticeNo;
	private String noticeTitle;
	private String noticeContent;
	private Timestamp noticeDate;
	private Set teachers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** minimal constructor */
	public Notice(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	/** full constructor */
	public Notice(String noticeTitle, String noticeContent,
			Timestamp noticeDate, Set teachers) {
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeDate = noticeDate;
		this.teachers = teachers;
	}

	// Property accessors

	public Integer getNoticeNo() {
		return this.noticeNo;
	}

	public void setNoticeNo(Integer noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return this.noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return this.noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Timestamp getNoticeDate() {
		return this.noticeDate;
	}

	public void setNoticeDate(Timestamp noticeDate) {
		this.noticeDate = noticeDate;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

}