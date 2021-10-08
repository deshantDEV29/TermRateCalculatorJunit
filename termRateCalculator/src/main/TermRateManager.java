package main;

import java.util.Scanner;

public class TermRateManager {

	public static void main(String[] args) {
		
		int choice = 0; //declare choice variable
		Scanner input = new Scanner(System.in); // declare input scanner
		do {
			System.out.println("\n\t Term Rate Calculator"); //menu 
	        System.out.println("--------------------------------------");
	        System.out.println("1 - Calculate Term rate");
	        System.out.println("2 - Exit the Program");
	        choice = input.nextInt(); //prompts user to enter choice
	       
	        switch(choice) {
		        case 1: //execute when choice is 1
		    		System.out.print("Enter Years ");  
		    		int a= input.nextInt();  //prompts user to enter number of years
		    		System.out.print("Enter Months ");  
		    		int b= input.nextInt(); //prompts user to enter number of months
		    		TermRate termrate = new TermRate(a,b); //create a instance of TermRate class
		    		
		    		
		    		if(validate(termrate) == true) //executes when validation is true
		    		{
			    		double rate = computeTermInterestRate(a,b); // computeTermInterestRate method invocation
			    		System.out.println("\nThe Term Rate is:" + rate  + "%"); //prints term rate
		    		}
		    		else 
		    		{
		    			System.out.print("\nInvalid Input"); //prints when values are invalid 
		    		}	    		
		    		break;
		    		
		        case 2:	//executes when user selects 2        		
		        	System.out.println("Thanks for using the program :)"); 
		        	break;
		        		
		        default: //executes when user enters invalid input
			        System.out.println("Invalid Option!"); 
			        break;
		        }
				

		}while(choice !=2); // exits program when choice is 2
		
		input.close(); //closes scanner
	}

		public static double computeTermInterestRate(int numberOfYears,int numberOfMonths) { //calculate interest rate method
			
			double TermInterestRate = 0 ; //initialize to  0
			int period = (numberOfYears * 12) + numberOfMonths; //converting to years to months 
			
			if(period < 3) { //execute when Less than 3 months
				TermInterestRate = 2 ;
			}
			else if( period <=5 && period >= 3 ) { // execute when 3 months to 5 months
				TermInterestRate = 3.5;
			}
			else if(period <=11 && period >= 6 ) {// execute when 6 months to 11 months
				TermInterestRate = 4.5 ;
			}
			else if(period <24 && period >= 12 ) {// execute when 1 year to 1 year, 11 months
				TermInterestRate = 5.0 ;
			}		
			else if( period >= 24 ){// execute when 2 years and above
				TermInterestRate = 6.0 ;
			}
			
			return TermInterestRate; //return interest rate
		}
		
		public static boolean validate(TermRate termRate) {
			boolean _validateYears = termRate.validateYears() ;
			boolean _validateMonths = termRate.validateMonths();

			if(_validateYears == false || _validateMonths == false )		
				return false; // return false validation is not true
			else
				return true; // return true if validation is true
			
		}
}
