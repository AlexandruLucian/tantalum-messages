package com.tantalum.message.beans;

import org.springframework.http.ResponseEntity;

public class MessageResult<T> {

	private ResponseEntity<T> result;
}
