package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression regularExpression;

    @Before
    public void setUp() {
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown() {
        regularExpression = null;
    }

    @Test
    public void givenInputShouldReturnMatchingTheName() {
        regularExpression = new RegularExpression();
        String str = "jenny how r u";
        boolean cn = regularExpression.matchChecking(str);
        assertEquals(true,cn);


    }

    @Test
    public void givenInputShouldReturnnotMatchingTheName() {
        regularExpression = new RegularExpression();
        String str= "how r u";
        boolean result = regularExpression.matchChecking(str);
        assertEquals(false,result);


    }
    @Test
    public void givenInputShouldReturnmatchingTheNameMiddle() {
        regularExpression = new RegularExpression();
        String str = " how jenny u";
        boolean cn = regularExpression.matchChecking(str);
        assertEquals(true,cn);


    }
}

