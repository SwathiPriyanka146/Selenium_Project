package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Dragdrop {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		act.contextClick(drag);
		Thread.sleep(2000);
		act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
     
	}

}
