package main;

public class TermRate {

	//variable declaration 
		private int numberOfYears;
		private int numberOfMonths;
		//constructor for class
		public TermRate(int numberOfYears, int numberOfMonths) {
			super();
			this.numberOfYears = numberOfYears;
			this.numberOfMonths = numberOfMonths;
		}

		//getter method for number of years
		public int getNumberOfYears() {
			return numberOfYears;
		}
		// setter method for number of years
		public void setNumberOfYears(int numberOfYears) {
			this.numberOfYears = numberOfYears;
		}
		//getter method for number of months
		public int getNumberOfMonths() {
			return numberOfMonths;
		}
		// setter method number of months
		public void setNumberOfMonths(int numberOfMonths) {
			this.numberOfMonths = numberOfMonths;
		}


		// validating number of years input 
		public boolean validateYears() {
			boolean years;
			if (this.numberOfYears < 0) {
				years = false ; // initialize years to false if number of years < 0
			}                 
			else {
				years = true ;// initialize years to true if years is valid
			}
			return years ; 
				
		}
		// validating number of months 
		public boolean validateMonths() {
			boolean months ;
			if (this.numberOfMonths < 1 || this.numberOfMonths > 11) {
				months  = false; // initialize months to false if number of  1 < months > 11
			}
				
			else {
				months = true ; //initialize months to true if values are valid
			}
			return months ;  
		}
}
