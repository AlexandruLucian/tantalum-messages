package com.tantalum.message.api.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tantalum.message.beans.IMessage;
import com.tantalum.message.beans.impl.TextMessage;
import com.tantalum.message.service.IMessageService;

@RestController
public class MessageController {
	
	private static final Logger log = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	private IMessageService messageServiceText;

	@RequestMapping(value = "/message", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<IMessage> createMessage(@RequestBody TextMessage message) {
		IMessage result = messageServiceText.createMessage(message);
		return new ResponseEntity<IMessage>(result, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<IMessage> getMessage(@PathVariable Long id) {

		IMessage result = messageServiceText.getMessage(id);
		return new ResponseEntity<IMessage>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/messages", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<IMessage>> getMessages() {

		TextMessage message1 = new TextMessage(10l, "hello", LocalDateTime.now());
		TextMessage message2 = new TextMessage(11l, "hello", LocalDateTime.now());
		List<IMessage> results = new ArrayList<IMessage>();
		results.add(message1);
		results.add(message2);
		return new ResponseEntity<List<IMessage>>(results, HttpStatus.OK);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<IMessage> updateMessage(@PathVariable Long id, @RequestBody TextMessage message) {

		IMessage result = messageServiceText.updateMessage(message);
		return new ResponseEntity<IMessage>(result, HttpStatus.OK);
	}
}
