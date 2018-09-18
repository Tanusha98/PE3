package com.company;

public class ThrowException {
    public static void main(String[] args) {
        try{
            int a=0;
            int b=9;
            int c;
            if((c=a+b)==(a+b))
                throw new AddZeroException("Don't add zero re!!");
        }
        catch(AddZeroException addZeroException){
            System.out.println(addZeroException.query);
        }
        finally {
            System.out.println("i'm in finally... hahaha!!");
        }
    }
}
