package Web;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	protected WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\Desktop\\Driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
	
	
	}
}