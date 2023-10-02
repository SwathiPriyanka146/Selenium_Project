package Selenium_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebtableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]"));
		System.out.println("table.getText()");
		List<WebElement> companyname=driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[3]"));
		for(int i=0; i<companyname.size();i++){
	    System.out.println(companyname.get(i).getText());
			
			
		}
		

		
		
		

	}

}
