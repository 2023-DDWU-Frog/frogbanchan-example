package com.example.frogbanchan.controller;

import java.sql.Timestamp;

public class PartyForm {
	private int partyId;
	private Timestamp meetDate;
	private int menuId;
	private String content;

	public PartyForm(int partyId, Timestamp meetDate, int menuId, String content) {
		this.partyId = partyId;
		this.meetDate = meetDate;
		this.menuId = menuId;
		this.content = content;
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public Timestamp getMeetDate() {
		return meetDate;
	}

	public void setMeetDate(Timestamp meetDate) {
		this.meetDate = meetDate;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getContemnt() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}