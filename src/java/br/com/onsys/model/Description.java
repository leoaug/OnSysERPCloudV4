package br.com.onsys.model; 

import com.fasterxml.jackson.annotation.JsonProperty;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-14T10:44:34.055-03:00")
public class Description {

	 @JsonProperty("plain_text")
	 private String plainText;

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
	 
	 
}
