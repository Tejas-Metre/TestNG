package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngJenkinsExamples {
@Test

	void googleSrarch()
	{
		//browsersetup
				WebDriverManager.chromedriver().setup();
				
				//open browser
				WebDriver driver= new ChromeDriver();
				
				//Redirect to google
				driver.get("https://www.google.com/");
				
				WebElement textbox = driver.findElement(By.id("APjFqb"));
				textbox.sendKeys("Postman");	
				
				
				driver.findElement(By.name("btnK")).submit();
				}
	public static void main(String[] args) {
		TestngJenkinsExamples tc = new TestngJenkinsExamples();
		tc.googleSrarch();
		
	}
	
}
