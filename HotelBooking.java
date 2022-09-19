package com.adactin;


	import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class HotelBooking {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			String s = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",s+"\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com//SearchHotel.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("SyedAzarudeen97",Keys.ENTER);
		    driver.findElement(By.cssSelector("input[id='password']")).sendKeys("28246F",Keys.ENTER);
		    
		    WebElement location = driver.findElement(By.cssSelector("select[id='location']"));
		    Select se = new Select(location); 
		    se.selectByVisibleText("New York");
		      
		    WebElement hotels = driver.findElement(By.cssSelector("select[id='hotels']"));
		    Select se1 = new Select(hotels); 
		    se1.selectByVisibleText("Hotel Sunshine");
		    
		    WebElement RoomType = driver.findElement(By.cssSelector("select[id='room_type']"));
		    Select se2 = new Select(RoomType); 
		    se2.selectByVisibleText("Super Deluxe");
		    
		    WebElement rooms = driver.findElement(By.cssSelector("select[id='room_nos']"));
		    Select se3 = new Select(rooms); 
		    se3.selectByValue("5");
		    
		    Thread.sleep(2000);
		    WebElement element = driver.findElement(By.cssSelector("input[id='datepick_in']"));
		    element.clear();
		    element.sendKeys("14/07/2022");
		    Thread.sleep(2000);
		    WebElement element1 = driver.findElement(By.cssSelector("input[id='datepick_out']"));
		    element1.clear();
		    element1.sendKeys("16/07/2022");
		    
		    WebElement adultroom = driver.findElement(By.cssSelector("select[id='adult_room']"));
		    Select se4 = new Select(adultroom); 
		    se4.selectByValue("2");
		   
		    Thread.sleep(2000);
		    WebElement childrenroom = driver.findElement(By.cssSelector("select[id='child_room']"));
		    Select se5 = new Select(childrenroom); 
		    se5.selectByValue("2");
		    
		    	    
		    File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("C:\\eclipse\\Mini Project\\screenshot\\page1.png"));
			
		    driver.findElement(By.cssSelector("input[id='Submit']")).click();
		    
		    
	        File screenshotA = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(screenshotA, new File("C:\\eclipse\\Mini Project\\screenshot\\page2.png"));
	    	
		    driver.findElement(By.cssSelector("input[id='radiobutton_0']")).click();    
		    driver.findElement(By.cssSelector("input[id='continue']")).click();   
		    driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys("syed");   
		    driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys("  ");    
		    driver.findElement(By.cssSelector("textarea[id='address']")).sendKeys("Anna Nagar"); 
		    driver.findElement(By.cssSelector("input[id='cc_num']")).sendKeys("1234567887654321");
		       
		    Thread.sleep(2000);
		    WebElement cardtype = driver.findElement(By.cssSelector("select[id='cc_type']"));
		    Select se6 = new Select(cardtype); 
		    se6.selectByVisibleText("VISA");
		    
		    Thread.sleep(2000);
		    WebElement month = driver.findElement(By.cssSelector("select[id='cc_exp_month']"));
		    Select se7 = new Select(month); 
		    se7.selectByValue("2");
		    
		    Thread.sleep(2000);
		    WebElement year = driver.findElement(By.cssSelector("select[id='cc_exp_year']"));
		    Select se8 = new Select(year); 
		    se8.selectByValue("2016");
		    
		    driver.findElement(By.cssSelector("input[id='cc_cvv']")).sendKeys("121");
		    driver.findElement(By.cssSelector("input[id='book_now']")).click();
		    Thread.sleep(10000);
		    
		    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(screenshot, new File("C:\\eclipse\\Mini Project\\screenshot\\page3.png"));
	    	
		    driver.findElement(By.cssSelector("input[id='logout']")).click();



		    
		    
		    
		    






		

			



		}

	}

