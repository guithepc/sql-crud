package com.pcsolutions.spring.services.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Resource not found exception, Id: " + id);
    }
}
