package com.company;

public class EmptySourceFileException extends RuntimeException{
    public EmptySourceFileException() {
        super("Непроверяемое исключение");
    }
}
