package ImplicitWait;
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
	public static WebDriver driver;
public static void main(String[] args) {
   //Note: Following statement is required since Selenium 3.0, 
   //optional till Selenium 2.0
   
	System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
	driver = new ChromeDriver();



   // Launch the URL 
   driver.get("https://demoqa.com/tooltip-and-double-click/");
   System.out.println("demoqa webpage displayed");

   //Maximise browser window
   driver.manage().window().maximize();

   //Instantiate Action Class
   Actions actions = new Actions(driver);

   //Retrieve WebElement to perform right click
   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

   //Right Click the button to display Context Menu&nbsp;
   actions.contextClick(btnElement).perform();
   System.out.println("Right click Context Menu displayed");

   //Following code is to select item from context menu which gets open up on right click, this differs 
   //depending upon your application specific test case: 
   //Select and click 'Copy me' i.e. 2nd option in Context menu 
   WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
   elementOpen.click(); 

   // Accept the Alert 
   driver.switchTo().alert().accept();
   System.out.println("Right click Alert Accepted");

   // Close the main window 
   driver.close();
   
  }
  
}*/


/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class RightClickDemo {
 
 @Test
 public static void  main (String arg[]) throws InterruptedException{
                //Instantiating the WebDriver interface.
	 System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
 WebDriver driver = new ChromeDriver();
                //Open the required URL
 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
                //To maximize the browser
 driver.manage().window().maximize();
                //Create an object 'action' of an Actions class
 Actions action = new Actions(driver);
 By locator = By.cssSelector(".context-menu-one");
                //Wait for the element. Used Explicit wait
               WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
                WebElement rightClickElement=driver.findElement(locator);
                //contextClick() method to do right click on the element
                action.contextClick(rightClickElement).build().perform();
                WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
                //getText() method to get the text value
                String GetText = getCopyText.getText();
                //To print the value
                System.out.println(GetText);
                //To close the browser
                driver.close();
 }
}*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ContextClick {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","X://chromedriver.exe");
	 driver= new ChromeDriver();

//Launch the Application Under Test (AUT)
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

// Right click the button to launch right click menu options
Actions action = new Actions(driver);

WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
action.contextClick(link).perform();
// Click on Edit link on the displayed menu options
WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
element.click();
// Accept the alert displayed
//driver.switchTo().alert().accept();
// Closing the driver instance
//driver.quit();

}
}
