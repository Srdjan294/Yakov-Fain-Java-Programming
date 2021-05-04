package com.practicaljava.lesson3.ifandswitch;

class SwitchStatement {
	
	public static void main(String[] args) {
		
		int taxCode = 0;
		
		switch(taxCode) {
			case 0: 
				System.out.println("Tax Exempt");
				break;
			case 1:
				System.out.println("Low Tax Bracket");
				break;
			case 2:
				System.out.println("High Tax Bracket");
				break;
			default:
				System.out.println("Wrong Tax Bracket");
		
		}
		
		// Some code goes here
		
		String yourState = "NY";
		
		switch(yourState) {
			case "NY":
				System.out.println("Taxing by NY law");
				break;
			case "CA":
				System.out.println("Taxing by CA law");
				break;
			case "FL":
				System.out.println("Taxing by FL law");
				break;
			default:
				System.out.println("Wrong state");
			
		}
	}

}
