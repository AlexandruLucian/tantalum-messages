package com.tantalum.message.api.resource;

import java.util.List;
import java.util.Optional;

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

import com.tantalum.message.api.model.TextMessage;
import com.tantalum.message.service.IMessageService;

@RestController
public class MessageController {
	
	private static final Logger log = LoggerFactory.getLogger(MessageController.class);

	@Autowired
	private IMessageService messageServiceText;

	@RequestMapping(value = "/message", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TextMessage> createMessage(@RequestBody TextMessage message) {
		TextMessage result = messageServiceText.createMessage(message);
		return new ResponseEntity<TextMessage>(result, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Optional<TextMessage>> getMessage(@PathVariable Long id) {

		Optional<TextMessage> result = messageServiceText.getMessage(id);
		if(result.isPresent()) return new ResponseEntity<Optional<TextMessage>>(result, HttpStatus.OK);
		else return new ResponseEntity<Optional<TextMessage>>(Optional.empty(), HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/messages", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<TextMessage>> getMessages() {

		List<TextMessage> results = messageServiceText.getAllMessages();
		
		return new ResponseEntity<List<TextMessage>>(results, HttpStatus.OK);
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TextMessage> updateMessage(@PathVariable Long id, @RequestBody TextMessage message) {

		TextMessage result = messageServiceText.updateMessage(message);
		return new ResponseEntity<TextMessage>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/message/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> deleteMessage(@PathVariable Long id) {

		String result = messageServiceText.deleteMessage(id);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
