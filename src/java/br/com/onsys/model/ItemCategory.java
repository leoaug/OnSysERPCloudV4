package br.com.onsys.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCategory {
	@JsonProperty("title")
	private String title = null;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
