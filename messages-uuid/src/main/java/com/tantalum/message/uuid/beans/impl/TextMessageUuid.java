package com.tantalum.message.uuid.beans.impl;

import com.tantalum.message.uuid.beans.IMessageUuid;

public class TextMessageUuid implements IMessageUuid {

	private Long id;
	private String uuid;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
