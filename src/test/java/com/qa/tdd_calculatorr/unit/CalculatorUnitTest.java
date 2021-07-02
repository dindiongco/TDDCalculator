package com.qa.tdd_calculatorr.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.tdd_calculatorr.Calculator;


//As a user, I want to add two numbers on a calculator to get the sum of those two numbers.
//As a user, I want to subtract one number from another to get the result.
//As a user, I want to divide one number by another to get the result of a division as I am bad at division.
//As a user, I want to multiply two numbers to get the result.
//As a user, I want to get the remainder of two numbers to see what remains (use modulo)

public class CalculatorUnitTest {
	Calculator calculator;

	@Before
	public void init() {
		this.calculator = new Calculator();
	}

	@Test
	public void addTest() {
// Given 
		int num1 = 3;
		int num2 = 5;
		int expectedResult = 8;
// When 
		int actualResult = calculator.add(num1, num2);
// Then 
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void subtractTest() {
		int num1 = 10;
		int num2 = 7;
		
		int expectedResult = 3;
		
		int actualResult = calculator.subtract(num1, num2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void multiplyTest() {
		int num1 = 21;
		int num2 = 3;
		
		int expectedResult = 63;
		
		int actualResult = calculator.multiply(num1, num2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void divideTest() {
		int num1 = 21;
		int num2 = 3;
		
		int expectedResult = 7;
		
		int actualResult = calculator.divide(num1, num2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void moduloTest() {
		int num1 = 21;
		int num2 = 4;
		
		int expectedResult = 1;
		
		int actualResult = calculator.modulo(num1, num2);
		
		assertEquals(expectedResult, actualResult);
	}
	
}
