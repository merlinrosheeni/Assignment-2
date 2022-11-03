package week1.day2.Assginment;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	
		// check if the iterator variable is not equal to the array values respectively
			
		
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,8};
		// Sort the array
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		int length = arr.length;
		
		for (int i = 0; i < length; i++) {		
		
			if (arr[i] != i+1) {			
			}
				System.out.println("Missing number is " + (i+1));
				
				// once printed break the iteration
				break;

	}

	}
}