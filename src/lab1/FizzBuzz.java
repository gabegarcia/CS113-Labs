package lab1;

/*
 * CS113 - Monday 5:30
 * Lab 1
 * 1/27/2021
 * 
 * FizzBuzz.java: Write a program that prints the numbers from 1 to 100, but for multiples of 3 print “Fizz” instead of the number and for multiples of 5 print “Buzz”. For numbers that are 
 * multiples of both three and five print “FizzBuzz”.
 * 
 * @author	Gabe Garcia (gmgarcia1@gmail.com)
 * @version	1
 */

public class FizzBuzz {
	
	public static void main(String args[]) {
		
		int numArray[] = new int[100];
				
		//populate numArray
		
		for(int i = 1; i < 101; i++) {
			numArray[i-1] = i;
		}
		
		//iterate through numArray and print FizzBuzz stuff
		for(int i = 1; i< 101; i++) {
			if((numArray[i-1] % 3 == 0) && (numArray[i-1] % 5 == 0)) {
				System.out.print("FizzBuzz" + "\n");
				
			} else if(numArray[i-1] % 3 == 0) {
				System.out.print("Fizz" + "\n");
			}
			else if(numArray[i-1] % 5 == 0) {
				System.out.print("Buzz" + "\n");
			}
			else
			System.out.print(numArray[i-1] + "\n");
		}
	}
}
