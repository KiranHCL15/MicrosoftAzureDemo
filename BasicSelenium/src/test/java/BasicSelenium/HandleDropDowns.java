package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class HandleDropDowns {
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement s1 = driver.findElement(By.xpath("//select"));

		Select s2=new Select(s1);
		//	    s2.selectByIndex(2);
		//	    s2.selectByValue("ALB");
		s2.selectByVisibleText("Åland Islands");
		List<WebElement> options = s2.getOptions();
//		for(int i=0;i<options.size();i++)
//		{
//			s2.selectByIndex(i);
//		}
		System.out.println(options.size());
		//	    options.size();
		Thread.sleep(3000);
		driver.close();


	}
}
