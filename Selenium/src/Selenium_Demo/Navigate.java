package Selenium_Demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().to("https://www.meesho.com/");
	driver.navigate().to("https://www.organicharvest.in/");
	driver.navigate().to("https://themomsco.com/");
	driver.navigate().to("https://thelipbalmco.in/");
	driver.navigate().to("https://mamaearth.in/");
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	
	}

}
