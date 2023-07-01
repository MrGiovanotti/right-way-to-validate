package com.nashira.validateexample.services;

import org.springframework.http.ResponseEntity;

import com.nashira.validateexample.models.Message;
import com.nashira.validateexample.models.SendMessageResponse;

public interface MessageService {
    
    ResponseEntity<SendMessageResponse> sendMessage(Message message);
    
}
