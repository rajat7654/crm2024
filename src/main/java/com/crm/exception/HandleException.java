package com.crm.exception;

import com.crm.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class HandleException  {

  @ExceptionHandler(ResourceNotFound.class)
  public ResponseEntity<ErrorDetails> handleEmployeNotFounfException(ResourceNotFound e, WebRequest request){

    ErrorDetails errorDetails = new ErrorDetails(e.getMessage(),new Date(), request.getDescription(true));

    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);


  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorDetails> handleEmployeNotFounfException(Exception e, WebRequest request){

    ErrorDetails errorDetails = new ErrorDetails(e.getMessage(),new Date(), request.getDescription(true));

    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);


  }
}
