package BasicSelenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.ini4j.Ini;

public class CreateFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file=new File("C:\\Users\\kiran ghorpade\\OneDrive\\Desktop\\sampleFile");
		file.createNewFile();

		
		Scanner scan=new Scanner(file);
	    while(scan.hasNext())
	    {
	    System.out.println(scan.next());
	    }
	    
	    System.out.println();
	    
	   FileReader reader=new FileReader(file);
	   BufferedReader read=new BufferedReader(reader);
	   String line;
	   while((line=read.readLine()) != null)
	   {
		   System.out.println(line);
//		   Thread.sleep(1000);
	   }
	   
	   //This code is to read INI files
	   File filename=new File("C:\\Users\\kiran ghorpade\\OneDrive\\Desktop\\FileSample.ini.txt");
	   Ini fileINI=new Ini(filename);
	   System.out.println(fileINI.get("SectionName", "user"));
	   System.out.println(fileINI.get("SectionName", "password"));
	   
;
	   

	}

}
