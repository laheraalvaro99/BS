package com.example.DB1.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntityExcaption extends RuntimeException {

    public UnprocessableEntityExcaption(String message) {
        super("La validacion de los campos no cumple los requisitos establecidos");
    }
}
