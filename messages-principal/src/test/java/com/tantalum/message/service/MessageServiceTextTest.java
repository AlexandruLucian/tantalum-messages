package com.tantalum.message.service;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.tantalum.message.api.dao.MessageRepository;
import com.tantalum.message.api.model.TextMessage;
import com.tantalum.message.service.impl.MessageServiceText;

public class MessageServiceTextTest {

	@Mock
	private MessageRepository messageRepository;

	@InjectMocks
	private MessageServiceText messageServiceText;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldGetMessage_whenMessageIdExists() {
		// Prepare
		TextMessage returnTextMessage = new TextMessage(Long.valueOf(1), "abkdsjbkad", LocalDateTime.now());
		when(messageRepository.findById(anyLong())).thenReturn(Optional.of(returnTextMessage));
		// Action
		Optional<TextMessage> returnedTextMessage = messageServiceText.getMessage(Long.valueOf(1));
		// Assert
		Assertions.assertThat(returnedTextMessage.isPresent()).isTrue();
	}

	@Test
	public void shouldNotGetMessage_whenMessageIdDoesntExists() {
		// Prepare
		when(messageRepository.findById(anyLong())).thenReturn(Optional.empty());
		// Action
		Optional<TextMessage> returnedTextMessage = messageServiceText.getMessage(Long.valueOf(1));
		// Assert
		Assertions.assertThat(returnedTextMessage.isPresent()).isFalse();

	}
}
