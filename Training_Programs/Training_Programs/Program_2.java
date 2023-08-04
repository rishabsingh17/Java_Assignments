package Training_Programs;
import java.util.Scanner;
public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		System.out.print("Enter the Number 1 ");
		int num1 = console.nextInt();
		System.out.print("Enter the Number 2 ");
		int num2 = console.nextInt();
		int temp ;
		temp = num1 ;
		num1 = num2 ; 
		num2 = temp ;
		System.out.print("After swapping num1 is "+ num1 + " and num2 is " + num2);
	}

}
