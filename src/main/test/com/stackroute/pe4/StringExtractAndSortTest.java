package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExtractAndSortTest
{
    StringExtractAndSort stringExtractAndSort;
    @Before

    public void setUp() throws Exception {
        stringExtractAndSort=new StringExtractAndSort();
    }

    @After
    public void tearDown() throws Exception {
        stringExtractAndSort=null;
    }
    @Test
    public void stringExtractAndSort(){
        stringExtractAndSort=new StringExtractAndSort();
        String s1="Into the face of the young man who sat on terrace";
        String res=stringExtractAndSort.extractAndSort(s1);
        String result="[Into, face, man, of, on, sat, terrace, the, the, who, young]";
        assertEquals(result,res);
    }
}

