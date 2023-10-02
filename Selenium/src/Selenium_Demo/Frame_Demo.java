package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.rediff.com/");
		   driver.manage().window().maximize();
		   
		  
		  // driver.switchTo().frame(0);
		 //  driver.switchTo().frame()
		   String value=driver.findElement(By.xpath("//span[@class='sensex']")).getText();
		   System.out.println(value);
		   driver.switchTo().defaultContent();
		   driver.findElement(By.xpath("//li[@class='news']")).click();
		   
		   

	}

}
