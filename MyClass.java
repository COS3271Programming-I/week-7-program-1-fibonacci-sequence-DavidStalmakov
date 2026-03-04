package projectdavid;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many Fibonacci numbers would you like  to print (1-32)? ");
        int n = input.nextInt();
        
        if (n < 1 || n > 32) {
        	System.out.println("Please enter a number between 1 and 32.");
        } else {
        	int[] fibonacci = new int[n];
        	
        	if (n >= 1) fibonacci[0] = 1;
        	if (n >= 2) fibonacci[1] = 1;
        	
        	for (int i = 2; i < n; i++) {
        		fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        	}
        	
        	System.out.println("The first " + n + " Fibonacci numbers are: ");
        	for (int num : fibonacci) {
        		System.out.print(num + " ");
        	}
        }
        input.close();
    }
}

