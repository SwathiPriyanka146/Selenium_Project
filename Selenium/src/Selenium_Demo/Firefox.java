package Selenium_Demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/new/");
		

	}

}
