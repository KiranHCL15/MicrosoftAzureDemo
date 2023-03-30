package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.Timeout;

public class Windows {

	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();

//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//div[.='Mobiles']")).click();
//		Thread.sleep(2000);
		WebElement mensHover=driver.findElement(By.xpath("//span[.='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(mensHover).perform();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
		driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allTabs = driver.getWindowHandles();
		Iterator<String> itr = allTabs.iterator();
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			System.out.println(childWindow);
//			itr.next();
			driver.switchTo().window(childWindow);
		}
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='_2r_T1I _396QI4']")));
		File SrcFile = driver.findElement(By.xpath("//img[@class='_2r_T1I _396QI4']")).getScreenshotAs(OutputType.FILE);
		File target=new File("./result/screenshot1.jpeg");
//		FileUtils.copyFile(SrcFile, SrcFile);
		FileHandler.copy(SrcFile,target);
		
//		driver.close();
		
		

	}

}
