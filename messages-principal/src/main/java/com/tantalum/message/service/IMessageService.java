package com.tantalum.message.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tantalum.message.api.model.TextMessage;

@Service
public interface IMessageService {

	TextMessage getMessage(Long messageId);
	TextMessage createMessage(TextMessage message);
	TextMessage updateMessage(TextMessage message);
	List<TextMessage> getAllMessages();
	void deleteMessage(Long messageId);
}
