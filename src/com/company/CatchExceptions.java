package com.company;

public class CatchExceptions {
    public static void main(String[] args) {
        try{
            int[] arrays=new int[-1];
            throw new NegativeArraySizeException("negative array size error");
        }
        catch (NegativeArraySizeException n){
            System.out.println(n);
        }

        try{
            int[] message=null;
            message[0]++;
            throw new NullPointerException("null pointer error");
        }
        catch (NullPointerException nu){
            System.out.println(nu);
        }

        try {
            int[] array=new int[4];
            for(int increment = -1; increment < 5; increment++) {
                array[increment] = increment;
            }
            throw new ArrayIndexOutOfBoundsException("array out of bounds error");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
    }

}
