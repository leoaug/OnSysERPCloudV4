package br.com.onsys.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnswerJson {

	@JsonProperty("question_id")
	private Long questionId;
	
	@JsonProperty("text")
	private String text;

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
		
}
