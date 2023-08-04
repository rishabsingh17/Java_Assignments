package Training_Programs;

import java.util.Scanner;

public class Progrma_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number in digit  ");
		char c = console.next().charAt(0);
		switch(c){
		case '1' :
			System.out.print("One");
			break ;
		case '2':
			System.out.print("Two");
			break;
		case '3':
			System.out.print("Three");
			break;
		case '4':
			System.out.print("Four");
			break;
		case '5':
			System.out.print("Five");
			break;
		case '6':
			System.out.print("Six");
			break;
		case '7':
			System.out.print("Seven");
			break;
		case '8':
			System.out.print("Eight");
		case '9':
			System.out.print("Nine");
			break;
			
	    default:
	    	System.out.print("wrong value");
	        break;
	}
		
	}

}
