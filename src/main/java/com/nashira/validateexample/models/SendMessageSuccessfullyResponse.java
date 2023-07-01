package com.nashira.validateexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SendMessageSuccessfullyResponse extends SendMessageResponse {
    
    private Message message;
    
    public SendMessageSuccessfullyResponse(String status, Message message) {
        super(status);
        this.message = message;
    }
    
}
