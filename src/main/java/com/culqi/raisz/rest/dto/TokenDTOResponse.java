package com.culqi.raisz.rest.dto;

public class TokenDTOResponse {

	private String token;
	private String brand;
	private String creation_dt;
	
	public TokenDTOResponse(String token, String brand, String creation_dt) {
		this.token = token;
		this.brand = brand;
		this.creation_dt = creation_dt;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCreation_dt() {
		return creation_dt;
	}

	public void setCreation_dt(String creation_dt) {
		this.creation_dt = creation_dt;
	}

}
