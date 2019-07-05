package com.stackroute.pe4;

public class StringOccurance {
    //finding the occurrance of a character in a string
    public static int charactersCount(String s, char c) {
        int res=0,len=s.length();
        for (int i=0;i<len;i++)
            if (s.charAt(i) == c)
                res++;
        return res;
    }
}


