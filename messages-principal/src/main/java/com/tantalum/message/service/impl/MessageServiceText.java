package com.tantalum.message.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tantalum.message.api.dao.MessageRepository;
import com.tantalum.message.api.model.TextMessage;
import com.tantalum.message.service.IMessageService;

@Service
public class MessageServiceText implements IMessageService {
	
	private static final Logger log = LoggerFactory.getLogger(MessageServiceText.class);
	
	@Value("${spring.datasource.url}")
    private String derbyDatasourceUrl;
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public TextMessage getMessage(Long messageId) {
		return messageRepository.findById(messageId).get();
	}
	
	@Override
	public List<TextMessage> getAllMessages() {
		return (List<TextMessage>) messageRepository.findAll();
	}

	@Override
	public TextMessage createMessage(TextMessage message) {
		log.debug("createMessage ----- Start");
		//TextMessage message1 = new TextMessage(message.getId(), "hello", LocalDateTime.now());
		messageRepository.save(message);
		log.debug("Message created.");
		log.debug("createMessage ----- End");
		return message;
	}

	@Override
	public TextMessage updateMessage(TextMessage message) {
		TextMessage message1 = new TextMessage(message.getId(), "hello again", LocalDateTime.now());
		return message1;
	}

	@Override
	public void deleteMessage(Long messageId) {
		// TODO Auto-generated method stub
		
	}

}
