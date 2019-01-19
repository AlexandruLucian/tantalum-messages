package com.tantalum.message.uuid.service.impl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tantalum.message.uuid.service.IMessageUuidService;

@Service
public class MessageUuidService implements IMessageUuidService{

	private static final Logger log = LoggerFactory.getLogger(MessageUuidService.class);
	
	public String getMessageUuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
