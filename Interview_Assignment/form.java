package Interview_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class form {
	WebDriver driver;
	
	 @BeforeTest
	  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe"  );
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://demo.nopcommerce.com/"); 
	  driver.manage().window().maximize();
	  
	  }  
	 

		 
		 @Test
		  public void register() throws InterruptedException {
			    
				//locate Register and click on it
				driver.findElement(By.xpath("//a[@class='ico-register']")).click();
						
				//locate FirstName element
				WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
						
				//locate LastName element
				WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
						
				//locate Email element
				WebElement Email = driver.findElement(By.xpath("//input[@name='Email']"));
						
				//locate Password element
				WebElement Password = driver.findElement(By.xpath("//input[@name='Password']"));
						
				//locate ConfirmPassword element
				WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
				
				FirstName.sendKeys("Abhishek");
				LastName.sendKeys("Patil");
				Email.sendKeys("AbhishekPatil994@gmail.com");
				Thread.sleep(2000);
				Password.sendKeys("12345678");
				ConfirmPassword.sendKeys("12345678");
				driver.findElement(By.xpath("//button[@id='register-button']")).click();
				Thread.sleep(5000);
				
	 }
		 
		 @AfterTest
		  public void teardown() {
			  driver.close();
		  }

}
