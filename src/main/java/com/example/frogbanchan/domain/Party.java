package com.example.frogbanchan.domain;

import java.sql.Timestamp;

public class Party {
	private int partyId;
	private String creator;
	private String placeId;
	private String content;
	private Timestamp meetDate;
	
	
	
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getMeetDate() {
		return meetDate;
	}
	public void setMeetDate(Timestamp meetDate) {
		this.meetDate = meetDate;
	}
	
	
}
