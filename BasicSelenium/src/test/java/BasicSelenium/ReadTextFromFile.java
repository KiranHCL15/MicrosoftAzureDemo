package BasicSelenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFromFile {

	public static void main(String[] args) throws IOException {
		
		//read by file reader
		String data;
	File file=new File("C:\\Users\\kiran ghorpade\\OneDrive\\Desktop\\readTextFile.txt");
	FileReader read=new FileReader(file);
	BufferedReader reader=new BufferedReader(read);
//	String data = reader.readLine();
	while((data=reader.readLine()) != null)
	{
		System.out.println(data);
	}
	 
	
	//read by scanner
	 File file1 = new File("C:\\Users\\kiran ghorpade\\OneDrive\\Desktop\\readTextFile.txt");
	
	    Scanner sc = new Scanner(file1);
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());

	}

}
