package com.tantalum.message.service.impl;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tantalum.message.beans.IMessage;
import com.tantalum.message.beans.impl.TextMessage;
import com.tantalum.message.service.IMessageService;

@Component
public class MessageServiceText implements IMessageService {
	
	private static final Logger log = LoggerFactory.getLogger(MessageServiceText.class);
	
	@Value("${spring.datasource.url}")
    private String derbyDatasourceUrl;

	public TextMessage getMessage(Long messageId) {
		TextMessage message1 = new TextMessage(messageId, "hello", LocalDateTime.now());
		return message1;
	}

	public TextMessage createMessage(IMessage message) {
		TextMessage message1 = new TextMessage(message.getId(), "hello", LocalDateTime.now());
		return message1;
	}

	public TextMessage updateMessage(IMessage message) {
		TextMessage message1 = new TextMessage(message.getId(), "hello again", LocalDateTime.now());
		return message1;
	}

	public void deleteMessage(Long messageId) {
		// TODO Auto-generated method stub
		
	}
}
