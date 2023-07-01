package com.nashira.validateexample.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendMessageErrorResponse extends SendMessageResponse {
    
    List<String> errors;
    
    public SendMessageErrorResponse() {
        errors = new ArrayList<>();
    }
    
    public SendMessageErrorResponse(String status, List<String> errors) {
        super(status);
        this.errors = errors;
    }
    
}
