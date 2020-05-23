package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\D\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://sdetuniversity.com/projects/");
		
		//driver.findElement(By.name("ct100$MainContent$txtUserName")).sendKeys("tim@testemail.com");
		driver.manage().window().maximize();
		/*try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
	
       driver.close();
	}
}


