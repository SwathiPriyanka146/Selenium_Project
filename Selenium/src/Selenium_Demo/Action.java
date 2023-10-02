package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://corporate.spicejet.com/default.aspx");
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
        Thread.sleep(2000);
        act.doubleClick(driver.findElement(By.linkText("Travel Agent Login"))).build().perform();
        Thread.sleep(2000);
	}

}
