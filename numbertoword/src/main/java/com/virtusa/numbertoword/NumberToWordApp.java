package com.virtusa.numbertoword;

import com.virtusa.numbertoword.processor.AbstractProcessor;
import com.virtusa.numbertoword.processor.DefaultProcessor;

public class NumberToWordApp 
{
    public static void main( String[] args )
    {
        long[] numbers = new long[] {
        		0, 9, 10, 13, 67, 100, 150, 199, 300
        };
        

        AbstractProcessor processor = new DefaultProcessor();
        for(long n : numbers) {
        	System.out.println(processor.getName(n));
        }
    }
}
