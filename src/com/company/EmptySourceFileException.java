package com.company;

public class EmptySourceFileException extends Exception{
    public EmptySourceFileException() {
        super("Непроверяемое исключение");
    }
}
