package com.tantalum.message.api.impl;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tantalum.messages.beans.impl.TextMessage;

@RestController
public class MessageController {
	
	@RequestMapping(value = "/message", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<TextMessage> createMessage(@RequestBody TextMessage message) {
		
		return new ResponseEntity<TextMessage>(message,  HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET, consumes = "application/json")
	public ResponseEntity<TextMessage> getMessage(@PathVariable Long id) {
		
		TextMessage message1 = new TextMessage(id, "hello", LocalDateTime.now());
		return new ResponseEntity<TextMessage>(message1,  HttpStatus.OK);
	}
}
