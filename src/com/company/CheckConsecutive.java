package com.company;
import java.util.*;
import java.io.*;

public class CheckConsecutive {
    public boolean check(String query){
        query=query.trim();
        String[] values=query.split(",");
        Integer[] numbers=new Integer[values.length];
        int increment=0;
        int flag;
        for (String value:
             values) {
            numbers[increment]=Integer.parseInt(value);
            increment++;
        }
        if(numbers[0]-numbers[1]==-1)
            flag=-1;
        else if(numbers[0]-numbers[1]==1)
            flag=1;
        else
            return false;
        for (increment = 1; increment < values.length;) {
            if(numbers[increment-1]-numbers[increment]==flag)
                increment++;
            else
                return false;
        }
        return true;
    }
}
