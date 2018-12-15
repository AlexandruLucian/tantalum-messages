package com.tantalum.message.uuid.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tantalum.message.uuid.beans.IMessageUuid;
import com.tantalum.message.uuid.beans.impl.TextMessageUuid;

@Service
public class MessageUuidService {

	private static final Logger log = LoggerFactory.getLogger(MessageUuidService.class);
	
	public IMessageUuid getMessageUuid(Long id) {
		IMessageUuid messageUuid = new TextMessageUuid();
		messageUuid.setUuid(generateMessageUuid());
		messageUuid.setId(id);
		return messageUuid;
	}

	private String generateMessageUuid() {
		String uuid = UUID.randomUUID().toString().replace("-", "");
		log.debug("created uuid: " + uuid);
		return uuid;
	}
}
