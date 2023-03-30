package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
//		driver.navigate().refresh();
		//handling alert box
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//handling confirmation box
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//p[.='You Pressed Cancel']")).isDisplayed())
		{
			Assert.assertTrue("clicked on confirmation button", true);
		}
		else
		{
			Assert.assertFalse("failed to click on confirmation button", false);
		}
		
		//Handling alert with textbox
		
		driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Automation tester Kiran");
		Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
//        driver.navigate().back();
	}

}
