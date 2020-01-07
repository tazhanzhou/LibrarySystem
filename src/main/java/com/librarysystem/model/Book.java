package com.librarysystem.model;

public class Book {
	private String type;
	private String name;

	public Book() {

	}

	public Book(String type, String name) {
		this.name = name;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
