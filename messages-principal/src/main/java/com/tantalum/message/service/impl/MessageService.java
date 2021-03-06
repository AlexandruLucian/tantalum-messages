package com.tantalum.message.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tantalum.message.api.dao.MessageRepository;
import com.tantalum.message.api.model.TextMessage;
import com.tantalum.message.service.IMessageService;

@Service
public class MessageService implements IMessageService {
	
	private static final Logger log = LoggerFactory.getLogger(MessageService.class);
	
	@Value("${spring.datasource.url}")
    private String derbyDatasourceUrl;
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public Optional<TextMessage> getMessage(Long messageId) {
		return messageRepository.findById(messageId);
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
	public boolean deleteMessage(Long messageId) {
		boolean result = true;

		Optional<TextMessage> message = messageRepository.findById(messageId);
		if (message.isPresent()) {
			if (message.get().getModifiedTime().isBefore(LocalDateTime.now().plusMinutes(-2))) {
				messageRepository.deleteById(messageId);
			}
		} else {
			result = false;
		}
		return result;
	}

}
