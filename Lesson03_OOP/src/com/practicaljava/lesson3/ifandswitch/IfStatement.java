package com.practicaljava.lesson3.ifandswitch;

class IfStatement {
	
	public static void main(String[] args) {
		
		double totalOrderPrice = 101;
		
		if(totalOrderPrice > 100) {
			System.out.println("You'll get a 20% discount");
		}else {
			System.out.println("Order books for more than a" + 
								" $100 to get a 20% discount");
		}
	}

}
