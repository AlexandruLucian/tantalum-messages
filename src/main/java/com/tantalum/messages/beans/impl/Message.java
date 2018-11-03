package com.tantalum.messages.beans.impl;

import java.security.Timestamp;

import com.tantalum.messages.beans.IMessage;

public class Message implements IMessage {
	
	private int id;
	private String text;
	private Timestamp timestamp;
	
	
	public Message(int pId, String pText, Timestamp pTimestamp) {
		this.id = pId;
		this.text = pText;
		this.timestamp = pTimestamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
