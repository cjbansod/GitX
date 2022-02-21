package com.qa.SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumCodingChallenge {

	public static WebDriver driver;
	public static WebDriverWait wait;
    public static Stopwatch stop;
	
    //Setup browser
	public static void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, 10);
		
	}
	
	//close all browser instances
	public static void teardown()
	{
		driver.quit();
	}
	
	//load the url and wait for dataload
	public static void LoadUrl() 
	{
		  driver.navigate().to("https://www.worldometers.info/world-population/");
	      driver.manage().window().maximize();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.maincounter-number")));   
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       setup();
     
      //load URL
       LoadUrl();
       
       //initiating stop watch to start seconds count
       stop=new Stopwatch();
      
      //calling the printer method
      printtillnthSec(20L);
      
      //closing the browser instances
      teardown();
	  
	}

	//print all the site data method
	public static void printdata() 
	{
		if(driver.getTitle().contains("Worldometer")) 
		{
		  WebElement totalpopulation=driver.findElement(By.cssSelector("div.maincounter-number"));
	      WebElement birthtoday = driver.findElement(By.cssSelector("div.sec-counter>span[rel='births_today']"));
	      WebElement birthsthisyear = driver.findElement(By.cssSelector("div.sec-counter>span[rel='births_this_year']"));
	      WebElement deathstoday = driver.findElement(By.cssSelector("div.sec-counter>span[rel='dth1s_today']"));
	      WebElement deathsthisyear = driver.findElement(By.cssSelector("div.sec-counter>span[rel='dth1s_this_year']"));
	      WebElement populationgrowthtoday = driver.findElement(By.cssSelector("div.sec-counter>span[rel='absolute_growth']"));
	      WebElement populationgrowththisyear = driver.findElement(By.cssSelector("div.sec-counter>span[rel='absolute_growth_year']"));
	      
	      System.out.println("Current World Population");
	      System.out.println(totalpopulation.getText());
		  System.out.println("Births Today: "+birthtoday.getText() +" Births this Year: "+birthsthisyear.getText());
	      System.out.println("Deaths Today: "+deathstoday.getText() +" Deaths this year: "+deathsthisyear.getText());
	      System.out.println("Population Growth Today: "+populationgrowthtoday.getText() +" Population Growth this year: "+populationgrowththisyear.getText());
		}  
	      
	}
   
	//method to print the data till the time is < 20 seconds
	public static void printtillnthSec(long d) 
	{
		while(stop.elapsedTime()<d) 
		{
     	   System.out.println("=======Elapsed time is========="+stop.elapsedTime());
		   printdata();
		   driver.navigate().refresh();
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.maincounter-number")));    
		}	
	}
	
	
}
