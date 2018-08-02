package lab16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//this is my helper class
public class CountriesTextFile {

	public static void readFromFile() {

		String fileName = "Countries.txt";

		Path filePath = Paths.get(fileName); // Path is interface, paths is class
		File file = filePath.toFile(); // converting it to a file for reader uses later

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr); // this will read the file

			String line = reader.readLine(); // this is going to read each line of the file
			
			while (line != null) { //meaning when there are values in each line of txt
				System.out.println(line);
				line = reader.readLine(); //why do i have to repeat this?*******
			}
			reader.close();
			
			// } catch (FileNotFoundException e) {

		} catch (IOException e) { // catch clause bc this is the parent class? why does it only show p after i
									// type string line**********
			System.out.println("Something's wrong here..");
		}

	}

	public static void writeToFiles(String country) { //is this part right?***
		String fileName = "Countries.txt";
		Path writeFile = Paths.get(fileName);
		File file = writeFile.toFile();
		
		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true)) ; //explain**********
			outW.println(country);
			outW.close();
			//sysout?*****
		} catch (FileNotFoundException e1) {
			System.out.println("File not found.");
		}
		
		
	}

	
	
	public static void createFile() { //this is to create a new file if it's not created yet
		String fileName = "Countries.txt";
		Path createFile = Paths.get(fileName);
		
		if (Files.notExists(createFile)) {
			
			try {
				Files.createFile(createFile);
				System.out.println("File has been successfully created!");
			} catch (IOException e) {
				System.out.println("Something went wrong..");
			}
		}
		 
	}
	
	
	
}
