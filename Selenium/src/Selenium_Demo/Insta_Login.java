package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Login {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement username=driver.findElement(By.id("Phone number, username, or email"));
		username.sendKeys("swathi_rs146");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys("swathi@14");
	    WebElement log=driver.findElement(By.id(""));
	    log.click();
		
		

	}

}
