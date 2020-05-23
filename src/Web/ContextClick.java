package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ContextClick {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();

//Launch the Application Under Test (AUT)
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

// Right click the button to launch right click menu options
//Actions action = new Actions(driver);

//WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
//action.contextClick(link).perform();
// Click on copy link on the displayed menu options
//WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
//element.click();
// Accept the alert displayed
//driver.switchTo().alert().accept();
driver.findElement(By.cssSelector("#navbar-brand-centered > ul > li:nth-child(2) > a")).click();
driver.findElement(By.xpath("/html/body/div[3]/a")).click();

WebElement dwd=driver.findElement(By.id("user_title"));
Select sel=new Select(dwd);
sel.selectByVisibleText("Miss");
driver.findElement(By.name("firstname")).sendKeys("Ambuja");
driver.findElement(By.name("lastname")).sendKeys("A");
driver.findElement(By.id("user_phone")).sendKeys("8762282293");

WebElement dwd1=driver.findElement(By.id("user_dateofbirth_1i"));
Select sel1=new Select(dwd1);
sel1.selectByVisibleText("1995");


WebElement dwd2=driver.findElement(By.id("user_dateofbirth_2i"));
Select sel2=new Select(dwd2);
sel2.selectByVisibleText("May");
WebElement dwd3=driver.findElement(By.id("user_dateofbirth_3i"));
Select sel3=new Select(dwd3);
sel3.selectByVisibleText("21");

WebElement radio1 = driver.findElement(By.id("licencetype_t"));
radio1.click();
System.out.println("Radio Button Option 1 Selected");

WebElement dwd4=driver.findElement(By.id("user_licenceperiod"));
Select sel4=new Select(dwd4);
sel4.selectByVisibleText("2");

WebElement dwd5=driver.findElement(By.id("user_occupation_id"));
Select sel5=new Select(dwd5);
sel5.selectByVisibleText("Actor");

driver.findElement(By.name("street")).sendKeys("Test123");
driver.findElement(By.id("user_address_attributes_city")).sendKeys("Mysore");
driver.findElement(By.id("user_address_attributes_county")).sendKeys("India");
driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("570017");
driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("ambujahemmadi@gmail.com");
driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Test@123");
driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Test@123");
driver.findElement(By.name("submit")).click();

// Login  with registered email id page
//driver.findElement(By.cssSelector("#navbar-brand-centered > ul > li:nth-child(2) > a")).click();
driver.findElement(By.id("email")).sendKeys("ambujahemmadi@gmail.com");
driver.findElement(By.name("password")).sendKeys("Test@123");
driver.findElement(By.name("submit")).click();


// Closing the driver instance
//driver.quit();

}
}