package com.leadingedje.codecamp.tdd;

public class NumberStuff {

	public boolean checkPositiveNumber(int number, boolean flag) {
	    if (number > 0) {
	        return true;
	    }
	    if (flag) {
	        return true;
	    }
	    return false;
	}
}
