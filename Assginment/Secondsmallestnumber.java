package week1.day2.Assginment;

public class Secondsmallestnumber {
	
	//Find the Second smallest number in the array {23,45,67,32,89,22 }

	public static void main(String[] args) {
		
		int num;
		
		
		int a[]= {23,45,67,32,89,22};
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i; j < a.length-1; j++) {
				
				if(a[i] > a[j+1]) {
					
					num = a[i];
					
					a[i] = a[j+1];
					
					
					a[j+1] = num;
				}
			}
		}
		
	System.out.println("Second smallest number is " + a[1]);
		
	}

}
