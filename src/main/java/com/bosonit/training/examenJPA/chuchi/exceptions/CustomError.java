package com.bosonit.training.examenJPA.chuchi.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data

public class CustomError {
    private String message;
    private HttpStatus httpStatus;
    private Date timestamp;

    public CustomError(String message, HttpStatus httpStatus) {
        this.message= message;
        this.httpStatus= httpStatus;
        this.timestamp= new Date();
    }



}
