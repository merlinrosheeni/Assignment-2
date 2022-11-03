package week1.day2.Assginment;

public class Intersection {

	public static void main(String[] args) {
		//Declare An array for {3,2,11,4,6,7};	 
		 		
		int[] a= {3,2,11,4,6,7};
		// Declare another array for {1,2,8,4,9,7};
		
        int[] a1={1,2,8,4,9,7};
      //Declare for loop iterator from 0 to array length
        
        for (int i=0; i<a.length;i++) {
        	for (int j=0;j<a1.length;j++) {
        		// Compare Both the arrays using a condition statement

        		if(a[i]==a1[j]) {
        			 //Print the first array (shoud match item in both arrays)
        			System.out.println("my array"+a1[i]);
        		}
        	}
        }
        
	}

}
