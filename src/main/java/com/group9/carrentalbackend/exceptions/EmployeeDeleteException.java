package com.group9.carrentalbackend.exceptions;

public class EmployeeDeleteException extends Throwable {
    public EmployeeDeleteException(String message, Exception e) {
        super(message);
    }
}