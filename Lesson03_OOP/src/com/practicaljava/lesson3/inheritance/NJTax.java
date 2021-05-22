package com.practicaljava.lesson3.inheritance;

class NJTax extends Tax {
	
	double adjustForStudents (double stateTax) {
		
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}

}
