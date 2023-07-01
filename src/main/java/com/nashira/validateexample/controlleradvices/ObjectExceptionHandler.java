package com.nashira.validateexample.controlleradvices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nashira.validateexample.exceptions.ObjectNotValidException;
import com.nashira.validateexample.models.SendMessageErrorResponse;
import com.nashira.validateexample.models.SendMessageResponse;

@RestControllerAdvice
public class ObjectExceptionHandler {
    
    @ExceptionHandler()
    public ResponseEntity<SendMessageResponse> objectNotValidExceptionHandler(ObjectNotValidException exception) {
        SendMessageResponse sendMessageResponse = new SendMessageErrorResponse("Message not send",
                exception.getErrors());
        return ResponseEntity.badRequest().body(sendMessageResponse);
    }
    
}
