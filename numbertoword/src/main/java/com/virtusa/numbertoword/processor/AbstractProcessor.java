package com.virtusa.numbertoword.processor;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractProcessor {
	
	static protected final String SEPARATOR = " ";
    static protected final int NO_VALUE = -1;

    protected List<Integer> getDigits(long value) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        if (value == 0) {
            digits.add(0);
        } else {
            while (value > 0) {
                digits.add(0, (int) value % 10);
                value /= 10;
            }
        }
        return digits;
    }

    public String getName(long value) {
        return getName(Long.toString(value));
    }

    abstract public String getName(String value);

}
