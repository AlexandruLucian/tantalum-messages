package com.tantalum.message.uuid.beans;

import org.springframework.stereotype.Component;

@Component
public interface IMessageUuid {

	Long getId();
	void setId(Long id);

	String getUuid();
	void setUuid(String uuid);

}
