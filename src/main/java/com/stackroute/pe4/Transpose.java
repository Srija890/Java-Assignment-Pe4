package com.stackroute.pe4;

public class Transpose
{
    //transpose of a given sentence
    public static void main(String args[])
    {
        Transpose.stringTranspose("transpose a string");
    }
    public static String stringTranspose(String str)
    {
        String[] str1 = str.split(" ");
        int len=str1.length;
        String reversedString = "";
        for(int i=0;i<len;i++)
        {
            StringBuilder str3 = new StringBuilder(str1[i]);
            reversedString = reversedString +str3.reverse();
            reversedString=reversedString+" ";
        }
        String transpose=reversedString.trim();
        return transpose;
    }
}


