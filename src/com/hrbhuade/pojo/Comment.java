package com.hrbhuade.pojo;

import java.sql.Timestamp;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentNo;
	private Answercontent answercontent;
	private String commentUser;
	private String commentContent;
	private Timestamp commentDate;
	private Integer commentUserType;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(String commentUser, String commentContent,
			Timestamp commentDate) {
		this.commentUser = commentUser;
		this.commentContent = commentContent;
		this.commentDate = commentDate;
	}

	/** full constructor */
	public Comment(Answercontent answercontent, String commentUser,
			String commentContent, Timestamp commentDate,
			Integer commentUserType) {
		this.answercontent = answercontent;
		this.commentUser = commentUser;
		this.commentContent = commentContent;
		this.commentDate = commentDate;
		this.commentUserType = commentUserType;
	}

	// Property accessors

	public Integer getCommentNo() {
		return this.commentNo;
	}

	public void setCommentNo(Integer commentNo) {
		this.commentNo = commentNo;
	}

	public Answercontent getAnswercontent() {
		return this.answercontent;
	}

	public void setAnswercontent(Answercontent answercontent) {
		this.answercontent = answercontent;
	}

	public String getCommentUser() {
		return this.commentUser;
	}

	public void setCommentUser(String commentUser) {
		this.commentUser = commentUser;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Timestamp getCommentDate() {
		return this.commentDate;
	}

	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}

	public Integer getCommentUserType() {
		return this.commentUserType;
	}

	public void setCommentUserType(Integer commentUserType) {
		this.commentUserType = commentUserType;
	}

}