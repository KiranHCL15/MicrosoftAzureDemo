package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataproviderDemo {
    @DataProvider(name="data")
	public Object[][] test()
	{
		Object[][] result=new Object[5][2];
		result[0][0]="9901938379";
		result[0][1]="2lb14me018@facebook.com";
		
		result[1][0]="admin";
		result[1][1]="123";
		
		result[2][0]="user";
		result[2][1]="1234";
		
		result[3][0]="alex";
		result[3][1]="5678";
		
		result[4][0]="hellouser";
		result[4][1]="123456";
		
		return result;
	}
	@Test(dataProvider="data")
	public void login(String name,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

				
		driver.get("http://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys(name);
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.clear();
		Password.sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}

}
