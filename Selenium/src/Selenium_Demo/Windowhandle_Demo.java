package Selenium_Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		
		driver.findElement(By.id("category")).click();
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		//driver.close();
		driver.quit();
		Set<String> whs=driver.getWindowHandles();
		System.out.println(whs);
	}

}
