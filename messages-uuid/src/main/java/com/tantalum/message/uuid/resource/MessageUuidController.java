package com.tantalum.message.uuid.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tantalum.message.uuid.service.IMessageUuidService;

@RestController
public class MessageUuidController {
	
	@Autowired
	private IMessageUuidService messageUuidService;
	
	@RequestMapping(value = "/messageUuid", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> getMessageUuid() {

		String result = messageUuidService.getMessageUuid();
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
