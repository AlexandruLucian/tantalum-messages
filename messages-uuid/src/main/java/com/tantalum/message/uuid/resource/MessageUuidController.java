package com.tantalum.message.uuid.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tantalum.message.uuid.beans.IMessageUuid;
import com.tantalum.message.uuid.service.MessageUuidService;

@RestController
public class MessageUuidController {
	
	@Autowired
	private MessageUuidService messageUuidService;
	
	@RequestMapping(value = "/messageUuid/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<IMessageUuid> getMessageUuid(@PathVariable Long id) {

		IMessageUuid result = messageUuidService.getMessageUuid(id);
		return new ResponseEntity<IMessageUuid>(result, HttpStatus.OK);
	}

}
