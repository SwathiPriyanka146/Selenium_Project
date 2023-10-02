package Selenium_Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.dezlearn.com/javascript-alerts/");
    //simple alert
    driver.findElement(By.id("s_alert1")).click();
    Alert  simple=driver.switchTo().alert();
    Thread.sleep(2000);
    System.out.println(simple.getText());
    simple.accept();
    
    //confirm alert
    driver.findElement(By.id("c_alert2")).click();
    Alert confirm=driver.switchTo().alert();
    Thread.sleep(3000);
    confirm.dismiss();
    
    //prompt alert
    driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
    Alert prompt=driver.switchTo().alert();
    prompt.sendKeys("Chennai");
    Thread.sleep(2000);
    prompt.accept();
	}

}
