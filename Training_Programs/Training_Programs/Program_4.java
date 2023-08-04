package Training_Programs;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		   System.out.print("Enter the Number 1 ");
			int num1 = console.nextInt();
			System.out.print("Enter the Number 2 ");
			int num2 = console.nextInt();
			System.out.print("Enter the Number 3 ");
			int num3 = console.nextInt();
			if(num1 > num2 && num1 > num3) {
				System.out.print("The number1 is Greater ");
			
			}
			else if(num2 > num1 && num2 > num3)	{
				System.out.print("The number2 is Greater ");
			}
			else {
				System.out.print("The number3 is Greater ");
			}
	}

}
