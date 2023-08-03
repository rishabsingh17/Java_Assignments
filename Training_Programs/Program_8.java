package Training_Programs;

import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner console = new Scanner(System.in);
     System.out.println("Enter the marks in Mathematics out of 100 ");
     int m = console.nextInt();
     System.out.println("Enter the marks in Physics out of 100 ");
     int p = console.nextInt();
     System.out.println("Enter the marks in Chemistry out of 100 ");
     int c = console.nextInt();
     System.out.println("Enter the marks in Computer Science out of 100 ");
     int s = console.nextInt();
     System.out.println("Enter the marks in English out of 100 ");
     int e = console.nextInt();
     int total = m + p + c  + s + e ;
     int percentage = (total/5) ;
     if(m<35) {
    	 System.out.println("You are failed in maths");
     }
     else if (p<35) {
    	 System.out.println("You are failed in physics");
     }
     else if(c<35) {
    	 System.out.println("You are failed in chemistry");
     }
     else if(s<35) {
    	 System.out.println("You are failed in computer Science");
     }
     else if(e<35) {
    	 System.out.println("You are failed in English");
     }
     else {
    	 System.out.println("Congrats you are passed with " + percentage + " percentage" );
     }
     
     if(percentage <35){
    	 System.out.println("You are failed because of less percentage");
     }
	}

}
