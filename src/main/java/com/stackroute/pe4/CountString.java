package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountString {
    //counting the occurance of the string present in the sentence
    String result;
    public  String stringCount (String str, String search){
        int count = 0;
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(search);
        List<Integer> list=new ArrayList<Integer>();
        while (matcher.find()) {
            count++;
            result=result+matcher.start()+"-"+ matcher.end()+",";
        }
        return result.substring(0,result.length()-1);
    }
}

