package com.tantalum.messages.beans.impl;

import java.time.LocalDateTime;

import com.tantalum.messages.beans.IMessage;

public class TextMessage implements IMessage {
	
	private Long id;
	private String text;
	private LocalDateTime modifiedTime;
	
	public TextMessage(Long pId, String pText, LocalDateTime pModifiedTime) {
		this.id = pId;
		this.text = pText;
		this.modifiedTime = pModifiedTime;
	}
	
	public TextMessage() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(LocalDateTime modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
}
