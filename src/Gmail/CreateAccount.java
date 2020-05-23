package Gmail;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateAccount {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ambujakshi.anand\\\\eclipse-workspace\\\\Selenium Training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

                      driver.manage().window().maximize();

            String url = "https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&dsh=S2014033778%3A1589786689205860&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp";

            driver.get(url);
            /* driver.findElement(By.name("firstName")).sendKeys("Ambutest");
            driver.findElement(By.name("lastName")).sendKeys("Anand");
            driver.findElement(By.name("Passwd")).sendKeys("Test123");
            driver.findElement(By.name("ConfirmPasswd")).sendKeys("Test123");
            driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div[2]")).click(); */
            
            

            driver.findElement(By.id("identifierId")).sendKeys("ambujahemmai@gmail.com"); 

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      

            WebDriverWait wait=new WebDriverWait(driver, 20);               

            driver.findElement(By.xpath("//*[@id='accountDetailsNext']/span/span")).click();         

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        

           driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");             

            driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 

    }
}


//The problem is that, after mail id page, my password is getting written in the id box option & the server redirects to next password page. I want to ask, what should I do so that my password would be entered only in password page?

