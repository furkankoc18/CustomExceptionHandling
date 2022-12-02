package com.kocfurkan;

import com.kocfurkan.exceptions.AgeLessThanZeroException;
import com.kocfurkan.exceptions.AgesSumZeroException;

public class Test {
	public static void main(String[] args) throws AgeLessThanZeroException {
		//validateAge(-3);
		sumAge(0, 0);
	}

	private static void validateAge(int age) throws AgeLessThanZeroException {
		if (age < 0) {
			throw new AgeLessThanZeroException("Age cannot be negative!");
		}
	}
	
	private static void sumAge(int age1,int age2) {
		int sumAge=age1+age2;
		if(sumAge==0)
			throw new AgesSumZeroException("Sum of ages cannot be zero!");
	}
}
