package BasicSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RemoteWebDriverDemo {
      
	      public static RemoteWebDriver driver=null;

            @Test
		    @Parameters({"browser"})
		    public static void test(String browser) throws InterruptedException, MalformedURLException {
        	 if(browser.equalsIgnoreCase("chrome"))
        	 {
		       DesiredCapabilities capabilities = new DesiredCapabilities();
//		        capabilities.setCapability("browserName", "chrome"); 
		        capabilities.setBrowserName("chrome");
		        //To specify the browser
//		        capabilities.setCapability("version", "96.0");		//To specify the browser version
//		        capabilities.setCapability("platform", "win10");     
		     
        		 

//       	      ChromeOptions options = new ChromeOptions();
//       	       options.setAcceptInsecureCerts(true);
//       	       options.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		  //specify the hub URL    
       	       try{
		         driver=new RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
       	       }catch(MalformedURLException  e)
       	       {
       	    	 System.out.println("Invalid grid URL"); 
       	       }
		        driver.navigate().to("https://www.facebook.com");
		        driver.findElement(By.id("email")).sendKeys("Admin");
		        driver.findElement(By.id("pass")).sendKeys("admin123");
		        driver.findElement(By.name("login")).click();
		        Thread.sleep(4000);
		        driver.close();
        	 }

	}

}
