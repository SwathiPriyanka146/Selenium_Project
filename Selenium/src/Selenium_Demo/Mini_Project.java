package Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   
		  
		   WebElement username=driver.findElement(By.id("username"));
		   username.sendKeys("SWATHI14");
		   WebElement pass=driver.findElement(By.id("password"));
		   pass.sendKeys("swathirs146");
		   WebElement log=driver.findElement(By.id("login"));
		   log.click();
		   
		   WebElement location=driver.findElement(By.name("location"));
			Select s=new Select(location);
			//s.selectByIndex(2);
			s.selectByValue("Sydney");
			//s.selectByVisible("14");
			
			WebElement hotels=driver.findElement(By.name("hotels"));
			Select v=new Select(hotels);
			v.selectByValue("Hotel Sunshine");
			
			WebElement roomtype=driver.findElement(By.id("room_type"));
			Select r=new Select(roomtype);
			r.selectByVisibleText("Super Deluxe");
			
			driver.findElement(By.name("room_nos")).sendKeys("2 -Two");
			
			driver.findElement(By.name("datepick_in")).clear();
			driver.findElement(By.name("datepick_in")).sendKeys("22/2/22");
			
			driver.findElement(By.name("datepick_out")).clear();
			driver.findElement(By.name("datepick_out")).sendKeys("20/3/22");
			
			driver.findElement(By.name("adult_room")).sendKeys("2");
			
			WebElement child=driver.findElement(By.id("child_room"));
			Select w=new  Select(child);
			w.selectByValue("3");
			
            driver.findElement(By.id("Submit")).click();
		    
            driver.findElement(By.name("radiobutton_0")).click();
            
            driver.findElement(By.id("continue")).click();
			
		    driver.findElement(By.name("first_name")).sendKeys("R.SWATHI PRIYANKA");
		    
		    driver.findElement(By.name("last_name")).sendKeys("Ravi");
		    
		    driver.findElement(By.id("address")).sendKeys("No:74,1st Main Road,Anna Nagar,CH-40.");
		    
		    driver.findElement(By.name("cc_num")).sendKeys("2345 4567 5678 4567");
		    
		   // WebElement cctype=driver.findElement(By.className("select_combobox"));
		    //Select b=new Select(cctype);
		    //b.selectByValue("American Express");
		    driver.findElement(By.className("select_combobox")).sendKeys("American Express");
		    
		   // WebElement month=driver.findElement(By.name("cc_exp_month"));
			//Select m=new Select(month);
			//m.selectByValue("August");
		    driver.findElement(By.name("cc_exp_month")).sendKeys("MAY");
		    
		    driver.findElement(By.id("cc_exp_year")).sendKeys("2025");
		    
		    driver.findElement(By.name("cc_cvv")).sendKeys("377");
		    
		    driver.findElement(By.name("book_now")).click();
		    
		    
		    WebElement logout=driver.findElement(By.id("logout"));
		    logout.click();
		    Thread.sleep(3000);
		    
		   // driver.findElement(By.id("logout")).click();
		  //  WebElement logout=driver.findElement(By.id("logout"));
			//   logout.click();
		  
			
			
            
			
			
			
			

			
			

			
			
			
			
			
			
			

	}

}
