package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('email').value = '9901938379'");
		
//		Thread.sleep(60000);
		js.executeScript("document.getElementById('pass').value = '2lb14me018@facebook.com'");
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();",loginButton);
		Thread.sleep(1000);
		driver.quit();
		

	}

}
