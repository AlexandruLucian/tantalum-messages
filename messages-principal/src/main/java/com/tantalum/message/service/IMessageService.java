package com.tantalum.message.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tantalum.message.api.model.TextMessage;

@Service
public interface IMessageService {

	Optional<TextMessage> getMessage(Long messageId);
	TextMessage createMessage(TextMessage message);
	TextMessage updateMessage(TextMessage message);
	List<TextMessage> getAllMessages();
	void deleteMessage(Long messageId);
}
