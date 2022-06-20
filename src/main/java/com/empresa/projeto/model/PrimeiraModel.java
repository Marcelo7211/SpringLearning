package com.empresa.projeto.model;

public class PrimeiraModel {
	
	private String type;
	
	private String text;
	
	public PrimeiraModel(String type, String text) {
		super();
		this.type = type;
		this.text = text;
	}
	
	public PrimeiraModel() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
