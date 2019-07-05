package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose transpose;

    @Before
    public void setUp() {
        transpose = new Transpose();
    }

    @After
    public void tearDown() {
        transpose= null;
    }
    @Test
    public void givenInputShouldReturntransposeOfWord()
    {
        String str="transpose";
        String str1=transpose.stringTranspose(str);
        String str2="esopsnart";
        assertEquals(str2,str1);
    }
    @Test
    public void givenInputShouldReturntransposeOfFullString()
    {
        String str="transpose of String";
        String str1=transpose.stringTranspose(str);
        String str2="esopsnart fo gnirtS";
        assertEquals(str2,str1);
    }

}

