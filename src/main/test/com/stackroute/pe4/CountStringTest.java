package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString countString;
    @Before
    public void setUp() {
        countString = new CountString();
    }

    @After
    public void tearDown() {
        countString = null;
    }

    @Test
    public void countString(){
        countString=new CountString();
        String str="This is the text which to be searched";
        String search="is";
        String result=countString.stringCount(str,search);
        assertEquals("2-3,5-6",result);

    }
}
