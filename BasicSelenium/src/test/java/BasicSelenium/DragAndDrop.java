package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		//switching to inner frame
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(childFrame);
		
		//dragging and dropping an element
		WebElement dragElement= driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dropElement=driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).perform();
		
		

	}

}
