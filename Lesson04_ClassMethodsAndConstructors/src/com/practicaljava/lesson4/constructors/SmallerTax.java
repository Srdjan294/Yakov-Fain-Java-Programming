package com.practicaljava.lesson4.constructors;

class SmallerTax extends Tax {
	
	//Constructor (Implicit super constructor Tax() is undefined for default constructor. 
	//Must define an explicit constructor)
	SmallerTax(double gi, String st, int depen){
		super(gi,st,depen);
		
		//Adding code specific for constructor of subclass
		System.out.println("Applying special tax rates for my friends.");
	}
	
	public static void main(String[] args) {
		
		Tax t = new SmallerTax(50000, "NY", 3);
	}

}
