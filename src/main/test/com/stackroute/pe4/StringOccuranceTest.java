package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOccuranceTest {
    StringOccurance stringOccurance;
    @Before
    public void setUp() {
        stringOccurance = new StringOccurance();
    }

    @After
    public void tearDown() {
        stringOccurance = null;
    }

    @Test
    public void occuranceOfACharacter() {
        stringOccurance = new StringOccurance();
        String str = "java is a java again java";
        char s = 'a';
        int result = stringOccurance.charactersCount(str, s);
        int res = 9;
        assertEquals(res, result);
    }

    @Test
    public void occuranceOfACharacterI() {
        stringOccurance = new StringOccurance();
        String str = "java is a java again java";
        char s = 'i';
        int result = stringOccurance.charactersCount(str, s);
        int res = 2;
        assertEquals(res, result);
    }













    //finding the occurrance of a character in a string
    public static int charactersCount(String s, char c) {
        int res=0,len=s.length();
        for (int i=0;i<len;i++)
            if (s.charAt(i) == c)
                res++;
        return res;
    }
}












