package edu.handong.csee.java.lab06;
import java.util.Scanner; // call a package to use scanner 

/**
 * This program will get a house volume and start population,
 * and compute that how long weeks will be taken bugs are full in a house
 * ,how many bugs are in a house that time and how much their volume is.
 * @author JHS
 * 
 */
public class BugInfestation { //make a class 'BugInfestation'
	final double GROWTH_RATE = 0.95; //initialize instance variable, using final keyword for make a constant
	final double ONE_BUG_VOLUME = 0.002; //initialize instance variable, using final keyword for make a constant
	
	double hVolume; //declare instance variable
	int sPopulation; //declare instance variable
	
	/**
	 * main method do a practical running 
	 */
	public static void main(String[] args) { //make a main method
		double houseVolume; //declare a local variable
		int startPopulation; //declare a local variable
		BugInfestation buginf = new BugInfestation(); //instantiate buginf
		Scanner keyboard = new Scanner(System.in); //instantiate keyboard
		
		System.out.println("Enter the total volume of your house"); //print some message
		System.out.println("in cubic feet : "); //print some message
		houseVolume = keyboard.nextDouble(); //get a house volume value from user
		System.out.println("Enter the estimated number of "); //print some message
		System.out.println("roaches in your house : "); //print some message
		startPopulation = keyboard.nextInt(); //get a start population value from user
		System.out.println("Starting with a roach population of " + startPopulation); //print about start population
		System.out.println("and a house with a volume of " + houseVolume + " cubic feet,"); //print about house volume
		System.out.println("after " + + " weeks,"); //print about how many weeks 
		System.out.println("the house will be filled with " + + " roaches."); //print about how many bugs
		System.out.println("They will fill a volume of " + + " cubic feet"); //print about how much bugs volume
		System.out.println("Better call Debugging Experts Inc."); //print some message
		 
	}
	
	/**
	 * this method computes how long weeks be taken and how many bugs are in a house 
	 */
	public void computeWeekAndBug ()

}
