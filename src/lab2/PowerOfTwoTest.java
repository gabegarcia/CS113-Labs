package lab2;

/*
 * CS113 - Monday 5:30
 * Lab 2
 * 2/1/2021
 * 
 * PowerOfTwoTest.java: Create a tester to demonstrate PowerOfTwo.java works.
 * Please refer to the slides on how to work with JUnit. 
 * 
 * 
 * @author	Gabe Garcia (gmgarcia1@gmail.com)
 * @version	1
 * 
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfTwoTest {
	
	@Test
	public void isPowerTest() {
		assertEquals(PowerOfTwo.isPower(4), true);
		assertEquals(PowerOfTwo.isPower(5), false);
		assertEquals(PowerOfTwo.isPower(16), true);
	}

}
