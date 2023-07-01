package com.nashira.validateexample.exceptions;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ObjectNotValidException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    private final List<String> errors;
    
}
