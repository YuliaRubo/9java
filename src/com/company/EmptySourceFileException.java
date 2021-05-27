package com.company;

public class EmptySourceFileException extends Exception{
    public EmptySourceFileException() {

        super("Файл не существует или пустой");
    }
}
