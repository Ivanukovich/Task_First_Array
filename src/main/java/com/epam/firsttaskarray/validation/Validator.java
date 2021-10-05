package com.epam.firsttaskarray.validation;

public class Validator {
    private final static String regex_integer = "^-?\\d+(\\s(-?\\d+))*$";

    public boolean validateLine(String line){
        return line.matches(regex_integer);
    }
}
