/**
 * @author Kamalpreet Singh
 * @date 1/31/2016
 * Descritption: This is a digital planne that can track contact details.
 * There are two types of contacts in this program, personal and business.
 * This program will allow you to print out statistics of both types of contacts.
 */

import java.util.Scanner;

public class DriverClass {

	/**
	 * Declaring and initializing an array for personal contacts
	 */
	public static PersonalContact[] personalArray = {
			new PersonalContact("Joe Smith", 33, "100 Evergreen Ave", "Seattle", "WA", 98999),
			new PersonalContact("Lawrence Williams", 45, "2000 1st St", "Tacoma", "WA", 98100),
			new PersonalContact("Reachel Garcia", 12, "12 Forest Drive", "Los Angelos", "CA", 99301) };

	/**
	 * Delcaring and initializing an array for business contacts
	 */
	public static BusinessContact[] businessArray = {
			new BusinessContact("Gregory Smith", 67, "360-888-7777", "360-555-6666"),
			new BusinessContact("Jerome Bradley", 18, "216-111-2222", "253-444-7777"),
			new BusinessContact("Susie Adams", 23, "253-333-7777", "425-666-9999") };

	public static int input;
	public static Scanner in = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		/**
		 * Run this loop until user chooses option 3, exit on 3
		 */
		do {
			System.out.println();
			System.out.println(
					"Welcome to my planner!\n1. Print planner contacts.\n2. Print planner statistics.\n3. Exit.");

			input = in.nextInt();
			if (input == 1) {
				personalContact();
				businessContact();
				// showMenu();
			} else if (input == 2) {
				statistics();
				// showMenu();
			} else if (input == 3) {
				break;
			}

			/**
			 * Display this option if the user doesn't choose a valid option.
			 */
			else {
				System.out.println("Wrong choice, please choose a number between 1 to 3.");
			}

		} while (input != 3);
		in.close(); //Close the scanner
	}

	
	
	/**
	 * Creating a method for personal contacts, print out personal array (that was initialized above).
	 */
	public static void personalContact() {
		for (PersonalContact k : personalArray) {
			System.out.println(k);
		}
	}

	
	
	/**
	 * Creating a method for business contacts, print out personal array (that was initialized above).
	 */
	public static void businessContact() {

		for (BusinessContact k : businessArray) {
			System.out.println(k);
		}
	}

	
	
	/**
	 * This method is for option 2, print out the no. personal, business, and
	 * total contacts. And average age of each contact as well.
	 */
	public static void statistics() {

		// Count the total number of contacts
		int totalContacts = personalArray.length + businessArray.length;
		int ageTotal = 0;
		for (int i = 0; i < personalArray.length; i++) {
			ageTotal += personalArray[i].getAge();
		}
		for (int i = 0; i < businessArray.length; i++) {
			ageTotal += businessArray[i].getAge();
		}

		/**
		 * Count the avergae age by dividing total number of the age and number
		 * of contacts
		 */
		int ageTotalAvg = 0;
		ageTotalAvg = ageTotal / totalContacts;

		System.out.println("Number of contacts: " + totalContacts + "\nNumber of personal contacts: "
				+ personalArray.length + "\nNumber of business contacts: " + businessArray.length
				+ "\nAverage contact age: " + ageTotalAvg);
	}

}