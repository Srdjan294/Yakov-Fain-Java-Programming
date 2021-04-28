package com.practicaljava.lesson3;

public class Instances {
	
	public static void main(String[] args) {
		
		JamesBondCar car1 = new JamesBondCar();
		JamesBondCar car2 = new JamesBondCar();
		
		car1.color = "white";
		car1.currentSubmergeDepth = 60;
		car1.isGunOnBoard = true;
		car1.numberOfDoors = 2;
		car1.submerge(); //currentSubmergeDepth = 50
		
		car2.color = "black";
		car2.currentSubmergeDepth = 40;
		car2.isGunOnBoard = false;
		car2.numberOfDoors = 4;
		
		System.out.println(car1.color + "\n" + 
						   car1.currentSubmergeDepth + "\n" + 
						   car1.isGunOnBoard + "\n" + 
						   car1.numberOfDoors + "\n" + 
						   car1.MANUFACTURER + "\n");
		
		System.out.println(car2.color + "\n" + 
				   		   car2.currentSubmergeDepth + "\n" + 
				           car2.isGunOnBoard + "\n" + 
				           car2.numberOfDoors + "\n" + 
				           car2.MANUFACTURER);
	}

}
