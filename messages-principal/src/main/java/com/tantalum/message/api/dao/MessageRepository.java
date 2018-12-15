package com.tantalum.message.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.tantalum.message.api.model.TextMessage;

public interface MessageRepository extends CrudRepository<TextMessage, Long> {

}
