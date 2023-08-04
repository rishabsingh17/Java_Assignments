package Training_Programs;

import java.util.Scanner;

public class Program_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in) ;
		  int number_Of_DaysInMonth = 0; 
	      String MonthOfName = "Unknown";
		  System.out.print("Enter the Month number  ");
		  int month = console.nextInt();
		  
		  System.out.print("Input year   ");
		  int year = console.nextInt();
		  
		  switch(month) {
		  case 1:
			  MonthOfName = "January" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  case 2 :
			  MonthOfName = "February" ;
			  if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				  number_Of_DaysInMonth = 29 ;
			  }
			  else {
				  number_Of_DaysInMonth = 28;
			  }
			  break;
		  case 3 :
			  MonthOfName = "March" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  case 4 :
			  MonthOfName = "April" ;
			  number_Of_DaysInMonth = 30 ;
			  break;
		  case 5 :
			  MonthOfName = "May" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  case 6 :
			  MonthOfName = "June" ;
			  number_Of_DaysInMonth = 30 ;
			  break;
		  case 7 :
			  MonthOfName = "July" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  case 8 :
			  MonthOfName = "August" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  case 9 :
			  MonthOfName = "September" ;
			  number_Of_DaysInMonth = 30 ;
			  break;
		  case 10 :
			  MonthOfName = "october" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  case 11 :
			  MonthOfName = "November" ;
			  number_Of_DaysInMonth = 30 ;
			  break;
		  case 12 :
			  MonthOfName = "December" ;
			  number_Of_DaysInMonth = 31 ;
			  break;
		  default :
			  System.out.println("Please Enter correct month or year ");
		  }
		  System.out.println("The number of Days in " + MonthOfName+ "  is  "+  number_Of_DaysInMonth +" Days");
		  
	}

}
