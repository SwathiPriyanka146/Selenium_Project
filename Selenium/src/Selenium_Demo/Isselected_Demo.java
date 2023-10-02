package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.organicharvest.in/");
		System.out.println(driver.findElement(By.xpath("//span[@class='jsx-ba354eb18428a481']")).isSelected());
		
		//driver.get("//omayo.blogspot.com/");
		//System.out.println(driver.findElement(By.id("but2")).isEnabled());
		//System.out.println(driver.findElement(By.xpath(null)).isDisplayed());
	}

}
