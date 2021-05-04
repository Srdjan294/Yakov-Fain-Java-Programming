package com.practicaljava.lesson3.tax;

class TestTax {
	
	public static void main(String[] args) {
		
		Tax t = new Tax(); //creating instance
		
		//adding values to class attributes
		t.grossIncome = 50000;
		t.dependents = 2;
		t.state = "NJ";
		
		double yourTax = t.calcTax(); //tax determination
		
		//showing results
		System.out.println("Your tax is " + yourTax);
	}

}
