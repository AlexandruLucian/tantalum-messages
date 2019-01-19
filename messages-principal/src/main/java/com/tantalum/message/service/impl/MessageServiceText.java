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
		TextMessage message1 = new TextMessage(messageId, "hello", LocalDateTime.now());
		return message1;
	}
	
	@Override
	public List<TextMessage> getAllMessages() {
		return (List<TextMessage>) messageRepository.findAll();
	}

	@Override
	public TextMessage createMessage(TextMessage message) {
		log.debug("createMessage ----- Start");
		message.setModifiedTime(LocalDateTime.now());
		messageRepository.save(message);
		log.debug("Message created.");
		log.debug("createMessage ----- End");
		return message;
	}

	@Override
	public TextMessage updateMessage(TextMessage message) {
		log.debug("updateMessage ----- Start");
		message.setModifiedTime(LocalDateTime.now());
		TextMessage updatedMessage = messageRepository.save(message);
		log.debug("updateMessage ----- End");
		return updatedMessage;
	}

	@Override
	public void deleteMessage(Long messageId) {
		log.debug("deleteMessage ----- Start");
		messageRepository.deleteById(messageId);
		log.debug("deleteMessage ----- End");
		
	}

}
