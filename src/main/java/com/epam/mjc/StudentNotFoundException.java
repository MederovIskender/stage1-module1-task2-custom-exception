package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    public StudentNotFoundException(String id){

        super("Could not find student with ID "+id);
    }
}
