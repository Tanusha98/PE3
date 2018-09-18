package com.company;

public class GradeOutOfLimits extends Exception{
    public void print(){
        System.out.println("ERROR: Please enter a grade between 0 and 100. ");
    }
}
