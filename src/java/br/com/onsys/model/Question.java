package br.com.onsys.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Question {

	@JsonProperty("item_id")
	private Long id;

	@JsonProperty("item_id")
	private String itemId = null;

	@JsonProperty("seller_id")
	private Integer sellerId = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("text")
	private String text = null;

	@JsonProperty("date_created")
	private Date dateCreated;

	@JsonProperty("deleted_from_listing")
	private boolean deletedFromListing;

	@JsonProperty("hold")
	private boolean  hold;

	@JsonProperty("answer")
	private Answer answer;

	@JsonProperty("from")
	private FromQuestion fromQuestion;
	
	@JsonIgnore
	private UserResponse userResponseQuestion;
	
	@JsonIgnore
	private ItemResponse itemResponse;
	
		
	
	
	
	public ItemResponse getItemResponse() {
		return itemResponse;
	}

	public void setItemResponse(ItemResponse itemResponse) {
		this.itemResponse = itemResponse;
	}

	public UserResponse getUserResponseQuestion() {
		return userResponseQuestion;
	}

	public void setUserResponseQuestion(UserResponse userResponseQuestion) {
		this.userResponseQuestion = userResponseQuestion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isDeletedFromListing() {
		return deletedFromListing;
	}

	public void setDeletedFromListing(boolean deletedFromListing) {
		this.deletedFromListing = deletedFromListing;
	}

	public boolean isHold() {
		return hold;
	}

	public void setHold(boolean hold) {
		this.hold = hold;
	}

	public FromQuestion getFromQuestion() {
		return fromQuestion;
	}

	public void setFromQuestion(FromQuestion fromQuestion) {
		this.fromQuestion = fromQuestion;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	

	  
}
