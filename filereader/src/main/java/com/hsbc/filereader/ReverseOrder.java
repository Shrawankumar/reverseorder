package com.hsbc.filereader;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ReverseOrder {


    public String reverse(String content){

           char[] a  = content.toCharArray();

        for(int i=0,j = a.length-1 ;i<=j;i++,j--){

             char temp = a[i];
             a[i] = a[j];
             a[j]=temp;
        }
        return new String(a);
    }
}
