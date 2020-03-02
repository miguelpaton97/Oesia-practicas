package com.oesia.formacion.practica.architecture.domain.model;

import java.util.List;

public class Message {

	public Message() {
	}

	private String operation;
	private List<List<String>> records;

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setRecords(List<List<String>> records) {
		this.records = records;
	}

	public Message(String operation, List<List<String>> records) {
		this.operation = operation;
		this.records = records;
	}

	public String getOperation() {
		return operation;
	}

	public List<List<String>> getRecords() {
		return records;
	}

}
