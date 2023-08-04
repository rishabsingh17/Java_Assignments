package Training_Programs;

import java.util.Scanner;

public class Program_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in) ;
		System.out.print("Input first floating­point number: "); 
		 double num1 = console.nextDouble(); 
		 System.out.print("Input second floating­point number: "); 
		 double num2 = console.nextDouble(); 
		 console.close(); 
		  
		 if (Math.abs(num1 - num2) <= 0.001) { 
		     System.out.println("These numbers are the same."); 
		 } 
		 else { 
		     System.out.println("These numbers are different."); 
		 } 
	}

}
