package BasicSelenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeIntoFile {

	

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\kiran ghorpade\\OneDrive\\Desktop\\writeIntoTextFile1.txt");
		
		
		FileWriter writer=new FileWriter(file);
		writer.write("i have written data into text file");
		writer.append("\r\n");
		writer.write("second data");
		writer.close();
		
	
		

	}

}
