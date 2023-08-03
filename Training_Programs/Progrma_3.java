package Training_Programs;
import java.util.Scanner;
public class Progrma_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner console = new Scanner(System.in);
   System.out.print("Enter the Number 1 ");
	int num1 = console.nextInt();
	System.out.print("Enter the Number 2 ");
	int num2 = console.nextInt();
	if(num1 > num2) {
		System.out.print("The number1 is Greater than number2 ");	
	}
	else {
		System.out.print("The number2 is Greater than number1 ");	
	}
	}

}
