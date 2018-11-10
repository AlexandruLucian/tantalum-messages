package com.tantalum.message.api.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tantalum.messages.beans.impl.Message;

@RestController
public class MessageController {
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Message> createMessage(@RequestBody Message message) {
		
		return new ResponseEntity<Message>(message,  HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.GET, consumes = "application/json")
	public ResponseEntity<Message> getMessage(@RequestBody Message message) {
		
		return new ResponseEntity<Message>(message,  HttpStatus.CREATED);
	}
}
