package com.nashira.validateexample.services.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nashira.validateexample.models.Message;
import com.nashira.validateexample.models.SendMessageResponse;
import com.nashira.validateexample.models.SendMessageSuccessfullyResponse;
import com.nashira.validateexample.services.MessageService;
import com.nashira.validateexample.validators.ObjectValidator;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    
    private final ObjectValidator<Message> messageValidator;
    
    @Override
    public ResponseEntity<SendMessageResponse> sendMessage(Message message) {
        
        SendMessageResponse sendMessageResponse;
        
        messageValidator.validate(message);
        
        sendMessageResponse = new SendMessageSuccessfullyResponse("successful",
                message);
        return ResponseEntity.ok(sendMessageResponse);
    }
    
}
