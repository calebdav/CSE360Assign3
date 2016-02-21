package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator testCalc = new Calculator();
		assertNotNull(testCalc);
	}

	@Test
	public void testGetTotal() {
		Calculator testCalc = new Calculator();
		assertEquals(testCalc.getTotal(), 0);
	}

	@Test
	public void testAddPositive() {
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		assertEquals(testCalc.getTotal(), 5);
		testCalc.add(5);
		assertEquals(testCalc.getTotal(), 10);
		testCalc.add(7);
		assertEquals(testCalc.getTotal(), 17);
	}
	
	@Test
	public void testAddNegative() {
		Calculator testCalc = new Calculator();
		testCalc.add(-3);
		assertEquals(testCalc.getTotal(), -3);
		testCalc.add(-5);
		assertEquals(testCalc.getTotal(), -8);
		testCalc.add(-11);
		assertEquals(testCalc.getTotal(), -19);
	}
	
	@Test
	public void testAddNegAndPos() {
		Calculator testCalc = new Calculator();
		testCalc.add(5);
		assertEquals(testCalc.getTotal(), 5);
		testCalc.add(-5);
		assertEquals(testCalc.getTotal(), 0);
		testCalc.add(7);
		assertEquals(testCalc.getTotal(), 7);
		testCalc.add(-2);
		assertEquals(testCalc.getTotal(), 5);
	}

	@Test
	public void testSubtractPositive() {
		Calculator testCalc = new Calculator();
		testCalc.subtract(5);
		assertEquals(testCalc.getTotal(), -5);
		testCalc.subtract(5);
		assertEquals(testCalc.getTotal(), -10);
		testCalc.subtract(7);
		assertEquals(testCalc.getTotal(), -17);
	}
	
	@Test
	public void testSubtractNegative() {
		Calculator testCalc = new Calculator();
		testCalc.subtract(-8);
		assertEquals(testCalc.getTotal(), 8);
		testCalc.subtract(-4);
		assertEquals(testCalc.getTotal(), 12);
		testCalc.subtract(-7);
		assertEquals(testCalc.getTotal(), 19);
	}
	
	@Test
	public void testSubtractNegAndPos() {
		Calculator testCalc = new Calculator();
		testCalc.subtract(10);
		assertEquals(testCalc.getTotal(), -10);
		testCalc.subtract(-6);
		assertEquals(testCalc.getTotal(), -4);
		testCalc.subtract(2);
		assertEquals(testCalc.getTotal(), -6);
		testCalc.subtract(-12);
		assertEquals(testCalc.getTotal(), 6);
	}

	@Test
	public void testMultiplyPositive() {
		Calculator testCalc = new Calculator();
		testCalc.add(1);
		testCalc.multiply(8);
		assertEquals(testCalc.getTotal(), 8);
		testCalc.multiply(2);
		assertEquals(testCalc.getTotal(), 16);
		testCalc.multiply(4);
		assertEquals(testCalc.getTotal(), 64);
	}
	
	@Test
	public void testMultiplyNegative() {
		Calculator testCalc = new Calculator();
		testCalc.add(1);
		testCalc.multiply(-3);
		assertEquals(testCalc.getTotal(), -3);
		testCalc.multiply(-5);
		assertEquals(testCalc.getTotal(), 15);
		testCalc.multiply(-7);
		assertEquals(testCalc.getTotal(), -105);
	}
	
	@Test
	public void testMultiplyNegativeAndPos() {
		Calculator testCalc = new Calculator();
		testCalc.add(1);
		testCalc.multiply(-4);
		assertEquals(testCalc.getTotal(), -4);
		testCalc.multiply(2);
		assertEquals(testCalc.getTotal(), -8);
		testCalc.multiply(-6);
		assertEquals(testCalc.getTotal(), 48);
		testCalc.multiply(3);
		assertEquals(testCalc.getTotal(), 144);
	}

	@Test
	public void testDividePositive() {
		Calculator testCalc = new Calculator();
		testCalc.add(100);
		testCalc.divide(3);
		assertEquals(testCalc.getTotal(), 33);
		testCalc.divide(4);
		assertEquals(testCalc.getTotal(), 8);
		testCalc.divide(2);
		assertEquals(testCalc.getTotal(), 4);
	}
	
	@Test
	public void testDivideNegative() {
		Calculator testCalc = new Calculator();
		testCalc.add(100);
		testCalc.divide(-2);
		assertEquals(testCalc.getTotal(), -50);
		testCalc.divide(-4);
		assertEquals(testCalc.getTotal(), 12);
		testCalc.divide(-6);
		assertEquals(testCalc.getTotal(), -2);
	}
	
	@Test
	public void testDivideNegAndPos() {
		Calculator testCalc = new Calculator();
		testCalc.add(100);
		testCalc.divide(-1);
		assertEquals(testCalc.getTotal(), -100);
		testCalc.divide(3);
		assertEquals(testCalc.getTotal(), -33);
		testCalc.divide(-2);
		assertEquals(testCalc.getTotal(), 16);
		testCalc.divide(5);
		assertEquals(testCalc.getTotal(), 3);
	}
	
	@Test
	public void testDivideZero() {
		Calculator testCalc = new Calculator();
		testCalc.add(57);
		testCalc.divide(0);
		assertEquals(testCalc.getTotal(), 0);
		testCalc.add(-42);
		testCalc.divide(0);
		assertEquals(testCalc.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		Calculator testCalc = new Calculator();
		assertEquals(testCalc.getHistory(), "");
	}

}
