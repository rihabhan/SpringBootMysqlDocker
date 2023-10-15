package com.sbmysql.sbmysql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessourcesNotfoundexception extends RuntimeException{
    public RessourcesNotfoundexception(String message)
    {
    super(message);
    }

}
