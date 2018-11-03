package com.tantalum.messages.beans;

import java.security.Timestamp;

public interface IMessage {
	
	int getId();
	void setId(int pId);
	
	String getText();
	void setText(String pText);
	
	Timestamp getTimestamp();
	void setTimestamp(Timestamp pTimestamp);

}
