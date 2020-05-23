package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBookDropdown {
	
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//maximize he window size
driver.manage().window().maximize();                 

//navigate to the RL
driver.get("https://www.facebook.com/");


//identify the expected drop down element in UI
WebElement dwd=driver.findElement(By.id("day"));

//create an object to "select"class and pass select drop down element as an argument
Select sel=new Select(dwd);

//perform an action on the drop down using select class method
 sel.selectByVisibleText("20");
Thread.sleep(3000);

//select the value from the month drop down
WebElement dwd1=driver.findElement(By.id("month"));

//create an object to "select" class and pass select drop down element as an argument
Select sel1=new Select(dwd1);  

//perform an action on the drop down using select class method
sel1.selectByIndex(12);
Thread.sleep(3000);       

//select the value from the year drop down
WebElement dwd2=driver.findElement(By.id("year"));

//create an object to "select" class and pass select drop down element as an argument
Select sel2=new Select(dwd2);  

//perform an action on the drop down using select class method
sel2.selectByVisibleText("1995");
Thread.sleep(3000);       

//identify the Multi-select drop down in UI
//System.out.println(sel.isMultiple());

//close the browser
//driver.close();                                    
}
} 