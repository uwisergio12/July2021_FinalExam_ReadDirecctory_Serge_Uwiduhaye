package finalExam;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
//		Generate 500 random numbers and print the nth smallest number in a programming language of your choice.
		
		int counter;
		int n=0;
		int N [] = new int[500];
		Random rnum = new Random();
		
		System.out.println("Random Numbers:");
		
        for (counter = 1; counter <= 500; counter++) {
           
        	int a = n++;
        	N[a]= rnum.nextInt(1000);
        	System.out.println(N[a] );
        }
        
        
        int smallest = N [0];
        
        for (int i= 1; i < N.length; i++) {
				
			    if (N [i] < smallest) {
        		smallest = N [i];
			    }
        	
        }
        	System.out.println("Smallest number is : "+ smallest);
	}
	
}