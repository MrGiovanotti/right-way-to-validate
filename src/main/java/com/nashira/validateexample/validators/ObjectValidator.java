package com.nashira.validateexample.validators;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.nashira.validateexample.exceptions.ObjectNotValidException;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@Component
public class ObjectValidator<T> {
    
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();
    
    public void validate(T objectToValidate) {
        
        Set<ConstraintViolation<T>> violations = validator.validate(objectToValidate);
        
        if (!violations.isEmpty()) {
            List<String> violationsAsList = violations
                    .stream()
                    .map(ConstraintViolation::getMessage)
                    .toList();
            throw new ObjectNotValidException(violationsAsList);
        }
        
    }
    
}
