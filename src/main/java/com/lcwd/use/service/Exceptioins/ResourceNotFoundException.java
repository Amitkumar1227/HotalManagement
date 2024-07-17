package com.lcwd.use.service.Exceptioins;

import org.springframework.stereotype.Component;

@Component
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found on Server !! ");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
