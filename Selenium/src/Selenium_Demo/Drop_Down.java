package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?Format=user_detail");
		
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select s=new Select(day);
		//s.selectByIndex(2);
		s.selectByValue("17");
		//s.selectByVisible("14");
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select m=new Select(month);
		m.selectByValue("05");
		
		WebElement year=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select y=new Select(year);
		y.selectByValue("2002");
		
		
		

	}

}
