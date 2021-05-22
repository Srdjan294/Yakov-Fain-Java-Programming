package com.practicaljava.lesson3.inheritance;

class TestTax {
	
	public static void main(String[] args) {
		
		NJTax t = new NJTax();
	
		double yourTax = t.calcTax();
		double totalTax = t.adjustForStudents(yourTax);
	
		System.out.println("yourTax: " + yourTax + "\n" + "totalTax: " + totalTax);
	}

}
