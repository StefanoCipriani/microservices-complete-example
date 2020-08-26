package com.complete.microservices.microservice0.beans.model;

public class HelloConfiguration {

	private String message;
	private String description;
	
	public HelloConfiguration(String message, String description) {
		this.message=message;
		this.description=description;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
