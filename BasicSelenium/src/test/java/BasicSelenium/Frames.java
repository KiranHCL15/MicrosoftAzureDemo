package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

				
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//swithcing to window by name
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kiran@hcl");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();

		//swithcing to window by id
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kiran@hcl");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();

		//swithcing to window by WebElement
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://demo.automationtesting.in/Frames.html");
	
		WebElement singleFrameId = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleFrameId);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kiran@hcl");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[.='Iframe with in an Iframe']")).click();

		

	}

}
