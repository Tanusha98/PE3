package com.company;

public class AddZeroException extends Exception{
    public String query;
    public AddZeroException(String query){
        this.query=query;
    }
}
