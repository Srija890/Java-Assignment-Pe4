package com.stackroute.pe4;

import java.util.Arrays;

public class StringExtractAndSort
{
    //Spliting the sentence and extract the words and then sort the words
    public String extractAndSort(String str) {

        String[] sort = str.split(" ");
        int n = sort.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sort[i].compareTo(sort[j]) > 0) {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        String str1= Arrays.toString(sort);
        return str1;
    }
}

