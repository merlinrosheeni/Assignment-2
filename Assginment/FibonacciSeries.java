package week1.day2.Assginment;

public class FibonacciSeries {

	public static void main(String[] args) {
		//// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		int range = 8;
		int firstNumber = 0;
		int secondNumber = 1;
		int sum;
		
		
		// Print first number
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		// Iterate from 1 to the range
		for (int i=1; i<range-1; i++) {
			
			// add first and second number assign to sum
			
			sum = firstNumber + secondNumber;
			
			System.out.println(sum);

			firstNumber = secondNumber;
			
			secondNumber = sum;
		
		
		

		
		
		}		
			
	}

}
