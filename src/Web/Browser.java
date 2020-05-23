package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  
  
public class Browser {  
  
    public static void main(String[] args) {  
    	WebDriver driver;
          
          // System Property for Gecko Driver   
System.setProperty("webdriver.gecko.driver","C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\geckodriver.exe" );  
driver = new FirefoxDriver();
          
         // Launch Website  
    driver.navigate().to("http://www.javatpoint.com/");  
          
        // Click on the Custom Search text box and send value  
    driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
          
        // Click on the Search button  
driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();    
        }  
  
} 

/*public class Browser {
	 
    public static void main(String[] args) {
         
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
         
        
        System.setProperty("webdriver.ie.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\IEDriverServer.exe");
         driver = new InternetExplorerDriver();
         
        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
         
        //Closing the browser
        driver.quit();
  
    }
  
}*/


