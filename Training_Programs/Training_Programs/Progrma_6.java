package Training_Programs;

import java.util.Scanner;

public class Progrma_6 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	
		// TODO Auto-generated method stub
		
		System.out.print("Enter the shape which you want area ");
		String c = console.nextLine();
		switch(c){
		case "circle" :
			System.out.print("Enter the radius ");
			int r  = console.nextInt();
			System.out.print("Area of circle is " + 3.142*(r*r));
			break ;
		case "square":
			System.out.print("Enter the side ");
			int s  = console.nextInt();
			System.out.print("Area of square is " + (s*s));
			break;
		case "rectangle":
			System.out.print("Enter the length ");
			int l  = console.nextInt();
			System.out.print("Enter the breadth ");
			int b  = console.nextInt();
			System.out.print("Area of rectangle is " + (l*b));
			break;
	    default:
	    	System.out.print("wrong value");
	        break;
	}

}
}