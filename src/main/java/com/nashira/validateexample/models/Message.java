package com.nashira.validateexample.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    
    @NotNull(message = "Field FROM can't be null")
    @NotEmpty(message = "Field FROM can't be empty")
    private String from;
    
    @NotNull(message = "Field TO can't be null")
    @NotEmpty(message = "Field TO can't be empty")
    private String to;
    
    @NotNull(message = "Field CONTENT can't be null")
    private String content;
    
}
