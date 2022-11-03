package week1.day2.Assginment;

import org.apache.commons.collections4.iterators.LoopingIterator;

//Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder
		// break the iterator
	// Check the flag (Provide a condition)

public class PrimeNumber {
	
	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int Input =13;
		// Declare a boolean variable flag as false
		boolean flag= false;
		for (int i = 2;i<= Input/2;i++) {
			if (Input%i ==0) {
			flag = true;		
		}
		}
	if (flag)
	{
	System.out.println("Prime Number");
	}
	else {
		System.out.println("Not a Prime Number");
	}
	
	
	}
}
