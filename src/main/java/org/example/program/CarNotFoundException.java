package org.example.program;

import org.springframework.http.HttpStatus;

public class CarNotFoundException extends ExceptionEvent{

    public CarNotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorCode() {
        return "TAKI_SAMOCHÓD_NIE_ISTNIEJE";
    }
}
