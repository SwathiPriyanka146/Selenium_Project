package Selenium_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_List {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		List<WebElement> r=driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[1]"));
		
		
		List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[4]"));
		for(int i=0; i<r.size();i++) {
				if(r.get(i).getText().equalsIgnoreCase("Blue Star")) {
					System.out.println(currentprice.get(i).getText());
				}
				
		

	}

}
}