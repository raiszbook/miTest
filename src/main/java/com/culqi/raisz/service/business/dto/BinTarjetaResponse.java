package com.culqi.raisz.service.business.dto;

import java.util.Map;

public class BinTarjetaResponse {

	private Map<String, Object> number;
	private String scheme;
	private String type;
	private String brand;
	private Boolean prepaid;
	private Map<String, Object> country;
	private Map<String, Object> bank;

	public Map<String, Object> getNumber() {
		return number;
	}

	public void setNumber(Map<String, Object> number) {
		this.number = number;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getPrepaid() {
		return prepaid;
	}

	public void setPrepaid(Boolean prepaid) {
		this.prepaid = prepaid;
	}

	public Map<String, Object> getCountry() {
		return country;
	}

	public void setCountry(Map<String, Object> country) {
		this.country = country;
	}

	public Map<String, Object> getBank() {
		return bank;
	}

	public void setBank(Map<String, Object> bank) {
		this.bank = bank;
	}

}
