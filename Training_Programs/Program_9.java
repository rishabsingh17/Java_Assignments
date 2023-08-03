package Training_Programs;
import java.util.Scanner;
public class Program_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner console = new Scanner(System.in) ;
  System.out.print("Enter the number  ");
  char c = console.next().charAt(0);
  switch(c) {
  case '1':
	  System.out.println("The day is Monday ");
	  break;
  case '2' :
	  System.out.println("The day is Tuesday ");
	  break;
  case '3' :
	  System.out.println("The day is Wednesday ");
	  break;
  case '4' :
	  System.out.println("The day is Thursday ");
	  break;
  case '5' :
	  System.out.println("The day is Friday ");
	  break;
  case '6' :
	  System.out.println("The day is Saturday ");
	  break;
  case '7' :
	  System.out.println("The day is Sunday ");
	  break;
  default :
	  System.out.println("Please Enter correct number between 1 to 7 ");
  }
  
	}

}
