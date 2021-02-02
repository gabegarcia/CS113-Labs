package lab2;

/*
 * CS113 - Monday 5:30
 * Lab 2
 * 2/1/2021
 * 
 * PowerOfTwo.java: Write a methods that finds out if a number is a power of two. Create a tester to demonstrate it works.
 * Please refer to the slides on how to work with JUnit. 
 * 
 * 
 * @author	Gabe Garcia (gmgarcia1@gmail.com)
 * @version	1
 * 
 * 
 */

public class PowerOfTwo {
	
	
	static boolean isPower(int x) {
		boolean isPower = false;
		
		if(x % 2 == 0) {
			isPower = true;
		}
		return isPower;
			
	}

}
