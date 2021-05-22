package com.practicaljava.lesson4.constructors;

class Tax {
	
	//variables
	double grossIncome;
	String state;
	int dependents;

	//Constructor
	Tax(double gi, String st, int depen){
		
		//initialise class variables
		grossIncome = gi;
		state = st;
		dependents = depen;
		
		System.out.println("Tax constructor.");
	}
	
	public static void main(String[] args) {
		
		Tax t = new Tax(65000, "NJ", 3);
		
		t.dependents = 4;
		
		System.out.println(t.grossIncome + "\n" + 
						   t.state + "\n" + 
						   t.dependents);
	}
}
