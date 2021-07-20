/**
 * 
 */
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.sample.Calculator;

/**
 * @author smonda5p
 *
 */
class CalculatorTest {

	protected Calculator calc = null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();
	}

	/**
	 * Test method for {@link com.example.demo.sample.Calculator#add(int, int)}.
	 */
	@Test
	final void testAdd() {
		
		assertEquals(5,calc.add(2, 3)); // TODO
	}

	/**
	 * Test method for {@link com.example.demo.sample.Calculator#sub(int, int)}.
	 */
	@Test
	final void testSub() {
		assertEquals(0,calc.sub(3, 3)); // TODO
	}

	/**
	 * Test method for {@link com.example.demo.sample.Calculator#mul(int, int)}.
	 */
	@Test
	final void testMul() {
		assertEquals(6,calc.mul(2, 3)); // TODO
	}

	/**
	 * Test method for {@link com.example.demo.sample.Calculator#div(int, int)}.
	 */
	@Test
	final void testDiv() {
		assertEquals(5,calc.div(15, 3)); // TODO
	}

}
