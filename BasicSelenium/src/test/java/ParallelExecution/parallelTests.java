package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTests {
	public WebDriver driver;
	
    @Test
    public void FirefoxTest() throws InterruptedException {	 
        //Initializing the firefox driver (Gecko)
    	WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
//		driver.navigate().refresh();
		//handling alert box
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.quit();
     }

    @Test
	public void ChromeTest()
	{ 
  //Initialize the chrome driver
    	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9901938379");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("2lb14me018@facebook.com");

		driver.findElement(By.name("login")).click();
		driver.quit();
	}
    
   
}
