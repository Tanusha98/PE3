package com.company;

public class RemoveVowels {
    public String removeVowel(String name){
        for (int increment = 1; increment < name.length(); increment++) {
            if(name.charAt(increment)=='a'||name.charAt(increment)=='e'||name.charAt(increment)=='i'||name.charAt(increment)=='o'||name.charAt(increment)=='u'|| name.charAt(increment)=='A'||name.charAt(increment)=='E'||name.charAt(increment)=='I'||name.charAt(increment)=='O'||name.charAt(increment)=='U'){
                name=name.substring(0, increment) + name.substring(increment + 1);
                if(increment>1)
                    increment--;
            }
        }
        return name;
    }
}
