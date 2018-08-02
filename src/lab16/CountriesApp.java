package lab16;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String answer;
				
		System.out.println("Welcome to the COuntries Maintenance Application!");
		
		
		int optionNum = 0;
	
		do {
			System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit");
			optionNum = Validator.getInt(scan, "Enter option selection: ", 1, 4);
			if (optionNum == 1) {
				CountriesTextFile.readFromFile();
			} else if (optionNum == 2) {
				String country = Validator.getString(scan, "Enter a country");
				CountriesTextFile.writeToFiles(country);
				CountriesTextFile.readFromFile();
			} 
			
			else if (optionNum == 3) {
				Validator.getInt(scan, "Bye");
			}
			System.out.println("Continue?");
			answer = scan.next();
			if(answer.equalsIgnoreCase("no")) {
			System.out.println("Bye");
			}
		} while (answer.equalsIgnoreCase("yes"));
		
		
		scan.close();
	}

}
