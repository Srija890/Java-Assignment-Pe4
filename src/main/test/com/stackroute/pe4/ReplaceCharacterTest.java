package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter replaceCharacter;

    @Before
    public void setUp() {
        replaceCharacter = new ReplaceCharacter();
    }

    @After
    public void tearDown() {

        replaceCharacter = null;
    }

    @Test
    public void replaceCharacter() {
        replaceCharacter = new ReplaceCharacter();
        String str = "dry dried";
        char ch1 = 'd';
        char ch2 = 'f';
        String res = replaceCharacter.characterReplace(str, ch1, ch2);
        assertEquals("fry frief", res);
    }

    @Test
    public void replaceCharacterYWithT() {
        replaceCharacter = new ReplaceCharacter();
        String str = "dry dried";
        char ch1 = 'y';
        char ch2 = 't';
        String res = replaceCharacter.characterReplace(str, ch1, ch2);
        assertEquals("drt dried", res);

    }

    @Test
    public void replaceCharacterWithSpace() {
        replaceCharacter = new ReplaceCharacter();
        String str = "dry dried";
        char ch1 = 'r';
        char ch2 = ' ';
        String res = replaceCharacter.characterReplace(str, ch1, ch2);
        assertEquals("d y d ied", res);

    }
}










