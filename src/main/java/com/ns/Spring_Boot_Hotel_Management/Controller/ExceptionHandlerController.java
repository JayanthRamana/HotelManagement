package com.ns.Spring_Boot_Hotel_Management.Controller;


import com.ns.Spring_Boot_Hotel_Management.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandlerController extends RuntimeException {



    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<String> handleUserNotFoundException(RecordNotFoundException ex) {
        return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
    }





}
