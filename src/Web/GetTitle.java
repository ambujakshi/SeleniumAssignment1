package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		System.out.println("Page title is : "+driver.getTitle());
		WebElement textIndiaWebElement= driver.findElement(By.xpath("//(div[@title='Visit the main page'])"));
		String innerText= textIndiaWebElement.getText();
		System.out.println("Inner text is :"+innerText);
		
       // System.out.println(driver.findElement(By.tagName("Visit the main page")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"p-logo\"]")).getText());
		//driver.close();

	}

}
