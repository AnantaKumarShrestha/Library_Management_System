package com.core.libraryManagementSystem.Exception;

import com.core.libraryManagementSystem.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({BookNotFoundException.class, StudentNotFoundException.class})
    public ResponseEntity<ApiResponse> handleGlobalException(RuntimeException e){
        String message=e.getMessage();
        String status= Integer.toString(HttpStatus.NOT_FOUND.value());
        ApiResponse apiResponse=new ApiResponse(message,status);
        return new ResponseEntity<>(apiResponse,HttpStatus.NOT_FOUND);
    }

}
