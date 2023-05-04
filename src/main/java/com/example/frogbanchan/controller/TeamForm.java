package com.example.frogbanchan.controller;

public class TeamForm {
	private int teamId;
	private String name;
	private String address;

	public TeamForm(int teamId, String name, String address) {
		this.teamId = teamId;
		this.name = name;
		this.address = address;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}