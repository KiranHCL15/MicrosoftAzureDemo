package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.http.ConnectionFailedException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
//	@Test
	public void test() throws InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver =new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println();
//		Thread.sleep(15000);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@id='nav-search-label-id']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
				System.out.println(dropdown.isDisplayed());;
//				dropdown.click();
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		
		System.out.println("printed");
	}
	
	@Test
	public void test2()
	
	{
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver =new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drop = driver.findElement(By.xpath("//select[@id='first']"));
		Select s=new Select(drop);
		s.selectByVisibleText("Google");
		s.selectByIndex(3);
	}

}
;