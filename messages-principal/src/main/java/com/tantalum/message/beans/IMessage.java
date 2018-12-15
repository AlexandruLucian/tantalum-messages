package com.tantalum.message.beans;

import java.time.LocalDateTime;


public interface IMessage {
	
	Long getId();
	void setId(Long pId);
	
	LocalDateTime getModifiedTime();
	void setModifiedTime(LocalDateTime pModifiedTime);
}
