package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Address {
	private String homeNumber;
	private String city;
	private String pin;
	public Address() {
		System.out.println("default constructor of address class");
	}
	public Address(String homeNumber, String city, String pin) {
		super();
		this.homeNumber = homeNumber;
		this.city = city;
		this.pin = pin;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [homeNumber=" + homeNumber + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
