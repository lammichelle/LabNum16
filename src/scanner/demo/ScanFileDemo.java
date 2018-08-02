package scanner.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFileDemo {

	public static void main(String[] args) {
		//create a string to hold the relative path for our file 
		String filePath = "example.txt"; //this file path will be seen later in package 
		
		//creates file object to pass variable file path into
		File fileTest = new File(filePath);
		
		try {
			Scanner scan = new Scanner(fileTest);
			//try to read the example.txt file by using while loop 
			//since we do not know how many lines are in the file
			
			while (scan.hasNextLine()) {
				String line = scan.nextLine(); //reading from our file
				System.out.println(line); //printing lines from file to our console
			}
			
			
			
			scan.close(); //need to close it here bc of scope 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Something went wrong. File not found.");
		} //pass in our FILE 
		
		
		
	}

}
