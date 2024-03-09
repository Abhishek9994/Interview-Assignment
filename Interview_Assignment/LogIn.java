package Interview_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogIn{
	
	
WebDriver driver;
	
    @BeforeTest
	public void firstStep() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	     driver.get("https://www.india.gov.in/");
	     driver.manage().window().maximize();
	}
	
    @Test
    public void sing_in() throws InterruptedException {
    	Thread.sleep(1000);
    	driver.findElement(By.linkText("Sign In")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("AbhishekPatil.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("12345678");
    	Thread.sleep(2000);
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
    	
    	driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
    }
    
    @AfterTest
	public void lastStep() {
		driver.close();
	}

}
