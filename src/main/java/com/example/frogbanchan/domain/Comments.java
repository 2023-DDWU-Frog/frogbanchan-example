package com.example.frogbanchan.domain;

import java.sql.Timestamp;

public class Comments {
	private int commentId;
	private int partyId;
	private String writer;
	private Timestamp writtenDate;
	private String content;
	
	public Comments() {
		
	}
	public Comments(int commentId, int partyId, String writer, Timestamp writtenDate, String content) {
		super();
		this.commentId = commentId;
		this.partyId = partyId;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.content = content;
	}
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Timestamp getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(Timestamp writtenDate) {
		this.writtenDate = writtenDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", partyId=" + partyId + ", writer=" + writer + ", writtenDate="
				+ writtenDate + ", content=" + content + "]";
	}
	
}
