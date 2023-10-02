package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatsapp {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	    WebElement username=driver.findElement(By.id("canvas"));
	    username.sendKeys("8925281881");
	    WebElement phone=driver.findElement(By.id("Link with phone number"));
	   phone.sendKeys("8925281881");
	    
	}

}
