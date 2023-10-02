package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	    WebElement username=driver.findElement(By.id("username"));
	    username.sendKeys("SWATHI14");
	    WebElement pass=driver.findElement(By.id("password"));
	    pass.sendKeys("swathirs146");
	    WebElement log=driver.findElement(By.id("login"));
	    log.click();
	}

}
