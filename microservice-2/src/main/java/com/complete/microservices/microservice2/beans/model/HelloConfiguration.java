package com.complete.microservices.microservice2.beans.model;

public class HelloConfiguration {

	private String message;
	private String description;
	private String port;
	
	public HelloConfiguration(String message, String description, String port) {
		this.message=message;
		this.description=description;
		this.port=port;
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

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
}
