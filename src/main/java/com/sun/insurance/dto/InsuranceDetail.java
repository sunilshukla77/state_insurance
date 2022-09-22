package com.sun.insurance.dto;


public class InsuranceDetail{

	private final int id;
	private final String name;
	private final String premiume;
		
	public InsuranceDetail(int id, String name, String premiume) {
		super();
		this.id = id;
		this.name = name;
		this.premiume = premiume;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPremiume() {
		return premiume;
	}
		
	
}
