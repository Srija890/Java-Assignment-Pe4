package com.stackroute.pe4;

import java.util.regex.Pattern;

public class RegularExpression {
    //regular expression to match the given name
    public boolean matchChecking(String str)
    {
        String regexName = ".*[jenny].*";
        String patternName = "(" + regexName + "){2,3}";
        Pattern pattern = Pattern.compile("jenny");
        return str.matches(patternName);
    }
}
