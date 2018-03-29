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
	
	double houseVolume; //declare instance variable
	double totalBugVolume; //declare instance variable
	double startPopulation; //declare instance variable
	double population;  //declare instance variable
	double newBugs; //declare instance variable
	double newBugVolume; //declare instance variable
	int countWeeks = 0; //initialize instance variable
	
	/**
	 * main method do a practical running 
	 */
	public static void main(String[] args) { //make a main method
		double hVolume; //declare a local variable
		double sPopulation; //declare a local variable
		BugInfestation bugInf = new BugInfestation(); //instantiate bugInf
		Scanner keyboard = new Scanner(System.in); //instantiate keyboard	
		
		System.out.println("Enter the total volume of your house"); //print some message
		System.out.println("in cubic feet : "); //print some message
		hVolume = keyboard.nextDouble(); //get a house volume value from user
		System.out.println("Enter the estimated number of "); //print some message
		System.out.println("roaches in your house : "); //print some message
		sPopulation = keyboard.nextDouble(); //get a start population value from user
		System.out.println("Starting with a roach population of " + (int)sPopulation); //print about start population
		System.out.println("and a house with a volume of " + hVolume + " cubic feet,"); //print about house volume
		
		bugInf.houseVolume = hVolume; //houseVolume's value is hVolumes's value
		bugInf.startPopulation = sPopulation; //startPopulation's value is sPopulation's value
		bugInf.computeAllThing(); //call a method to compute all variables 
		
		System.out.println("after " + bugInf.countWeeks + " weeks,"); //print about how many weeks 
		System.out.println("the house will be filled with " + (int)bugInf.population + " roaches."); //print about how many bugs
		System.out.println("They will fill a volume of " + (int)bugInf.totalBugVolume + " cubic feet"); //print about how much bugs volume
		System.out.println("Better call Debugging Experts Inc."); //print some message
		 
	}
	
	/**
	 * this method computes totalBugVolume, countWeeks and population
	 */
	public void computeAllThing() { //make a method
		population = startPopulation; //define what population's first value 
		totalBugVolume = population * ONE_BUG_VOLUME; //define what totalBugVolume's first value
		
		while(totalBugVolume < houseVolume) { //looping when totalBugVolume isn't small than houseVolume
			newBugs = population * GROWTH_RATE; //define newBugs's value
			newBugVolume = newBugs * ONE_BUG_VOLUME; //define newBugVolume's value
			population += newBugs; //define population's value
			totalBugVolume += newBugVolume; //define totalBugVolume's value
			countWeeks ++; //plus 1 to countWeeks when next line
		}
	}
	
}
