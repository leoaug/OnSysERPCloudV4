package br.com.onsys.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FromQuestion {


	@JsonProperty("id")
	private Long id;

	@JsonProperty("answered_questions")
	private String answeredQuestions;

	@JsonIgnore
	private UserResponse userResponseFromQuestion;
	
	

	public UserResponse getUserResponseFromQuestion() {
		return userResponseFromQuestion;
	}

	public void setUserResponseFromQuestion(UserResponse userResponseFromQuestion) {
		this.userResponseFromQuestion = userResponseFromQuestion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnsweredQuestions() {
		return answeredQuestions;
	}

	public void setAnsweredQuestions(String answeredQuestions) {
		this.answeredQuestions = answeredQuestions;
	}

	 
	
}
