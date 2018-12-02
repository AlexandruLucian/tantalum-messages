package com.tantalum.message.service;

import org.springframework.stereotype.Service;

import com.tantalum.message.beans.IMessage;

@Service
public interface IMessageService {

	IMessage getMessage(Long messageId);
	IMessage createMessage(IMessage message);
	IMessage updateMessage(IMessage message);
	void deleteMessage(Long messageId);
}
