package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import groovy.io.FileType;
import groovyjarjarantlr4.v4.codegen.model.OutputFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {
	@Test
	public void test() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.xpath("//button[.='New Browser Window']")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> Allids = driver.getWindowHandles();
		Iterator<String> I1 = Allids.iterator();
		while(I1.hasNext())
		{
			String child_window = I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//span[.='Menu']")).click();
				
				
		
//				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		File srcImage = driver.findElement(By.xpath("//img[@class='custom-logo']")).getScreenshotAs(OutputType.FILE);
		File file=new File("./Image/");
		FileUtils.copyFile(srcImage, file);
		driver.close();
		
	}

}
