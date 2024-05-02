package org.example.program;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler({ExceptionEvent.class})
    public ResponseEntity<String> handleError(ExceptionEvent exceptionEvent){

        return ResponseEntity
                .status(exceptionEvent.getHttpStatus())
                .contentType(MediaType.APPLICATION_JSON)
                .body(exceptionEvent.getErrorCode());
    }
}
