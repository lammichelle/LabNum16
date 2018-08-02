package fileIO.demo;

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

/**
 * This is a void method to read from a file
 */
public class FileHelper {

	// one method
	public static void readFromFile() {
		String dirString = "resources";
		String fileName = "yellow.txt"; // random name

		// Path filePath = Paths.get(fileName); // retrieve info
		Path filePath = Paths.get(dirString, fileName); // retrieve info
		File file = filePath.toFile();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);// create new string for buffer
			// these are kind of like scanner scan = new scanner (system.in)

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();

			}
			reader.close();

			// } catch (FileNotFoundException e) { //this is a child
		} catch (IOException e) { // this is a parent
			System.out.println("Something's wrong.");
		}
	}

	// another method
	public static void writeToFile() {
		String dir = "resources";
		String fileName = "yellow.txt";

		Person p = new Person("Michelle", 25);

		Path writeFile = Paths.get(dir, fileName);
		File file = writeFile.toFile(); // file class is in java IO, so needs to be imported

		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));

			outW.println(p);
			outW.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} // an instance we create
			// the true is to help add to the end
			// without the true, it will be overwritten everytime

	}

	// a 3rd method
	public static void createFile() {
		String dirString = "resources";
		String fileName = "yellow.txt"; // random name

		Path filePath = Paths.get(fileName); // retrieve info
		// Path filePath = Paths.get(dirString, fileName); // retrieve info

		if (Files.notExists(filePath)) { // just to check and see if file exists or not
			try {
				Files.createFile(filePath);
				System.out.println("FIle was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong.");
			}
		}
		System.out.println("File name: " + filePath.getFileName());
		System.out.println("Absolute Path: " + filePath.toAbsolutePath());
	}

	// a 4th method
	public static void createDirectory(String path) { //only when 3 or more files
		// path = "test";
		Path dirPath = Paths.get(path);
		// Path dirPath = Paths.get("resources"); -we could pass this directly in as a
		// parameter
		// for the Files.notExists() method to avoid declaring the string and path
		// variables above

		if (Files.notExists(dirPath)) {
			try {
				Files.createDirectories(dirPath);
				System.out.println("Folder was created successflly");
			} catch (IOException e) {
				System.out.println("Something went wrong.");
			}

		}

	}

}
