package BasicSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws IOException {
		try{
			FileInputStream fis=new FileInputStream("C:\\Users\\kiran ghorpade\\OneDrive\\Desktop\\demo.xlsx");


			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);


			for(Row row: sheet)      
			{  
				for(Cell cell: row) 
				{  

					System.out.print(cell.getStringCellValue()+"  ");
				}
				System.out.println();

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
