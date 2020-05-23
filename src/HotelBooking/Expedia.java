package HotelBooking;


//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.org.apache.bcel.internal.generic.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;


//import cucumber.api.java.Before;

public  class Expedia {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		String City= "New York";
		String Checkin = "22/06/2020";
		String Checkout = "23/06/2020";
		String NumOfGuest="3";
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.drive", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\geckodriver.exe");
		  //WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\IEDriverServer.exe");
        //driver = new InternetExplorerDriver();
                      
		driver.manage().window().maximize();

        driver.get("https://www.expedia.co.in/");
            
		//Search and select the Hotel tab
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		
		//Enter the destination City
		//driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(City);
		driver.findElement(By.name("destination")).sendKeys(City);
		
		//Enter the checkin date
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(Checkin);

		//driver.findElement(By.cssSelector("input[id='hotel-checkin-hp-hotel']")).sendKeys(Checkin);
		
		// Enter the checkout date
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(Checkout);
		//driver.findElement(By.cssSelector("input[id='hotel-checkout-hp-hotel']")).sendKeys(Checkout);
		
		//Select the Number of Guest
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]")).sendKeys(NumOfGuest);
	 
	   //driver.findElement(By.id("traveler-selector-hp-hotel")).sendKeys(NumOfGuest);   
       
	    //Click on search button and dashboard page
          driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	}
	
