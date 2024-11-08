package br.com.onsys.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {

	@JsonProperty("text")
	private String text;
	
	@JsonProperty("status")
	private String status;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
