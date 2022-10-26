package com.vti.entity;

public class LoginDto {

	private int id;

	private String email;

	public LoginDto(int id, String email) {
		this.id = id;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

}
