package com.kodilla.exception.main;

import com.kodilla.exception.io.FieldReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String[] args){

        FieldReader fieldReader = new FieldReader();
        try {
            fieldReader.readFile();
        } catch (FileReaderException e){
            System.out.println("Problem wile reading file!");
        }
    }
}
