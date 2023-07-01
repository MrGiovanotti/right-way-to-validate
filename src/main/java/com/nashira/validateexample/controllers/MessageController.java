package com.nashira.validateexample.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nashira.validateexample.models.Message;
import com.nashira.validateexample.models.SendMessageResponse;
import com.nashira.validateexample.services.MessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageController {
    
    private final MessageService messageService;
    
    @PostMapping("/send")
    public ResponseEntity<SendMessageResponse> send(@RequestBody Message message) {
        
        return messageService.sendMessage(message);
    }
    
}
