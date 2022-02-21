package com.qa.SeleniumDay2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class SeleniumCodingChallenge {

	static WebDriver  driver;
	static WebDriverWait wait;
	Set<String> values=new HashSet<String>();
	static SeleniumCodingChallenge b;

	public static void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, 10);

	}

	public static void teardown()
	{
		driver.quit();
	}

	public static void LoadUrl() 
	{
		driver.navigate().to("https://www.noon.com/uae-en/");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#btn_logo")));   
	}

	public static void main(String[] args) {

		setup();
		LoadUrl();
        b=new SeleniumCodingChallenge();
		b.genericDataCapturefromCarousel("Recommended For You");
		b.printdata();
		teardown();
	}

	public void printdata() 

	{
		List<String> val=new LinkedList<String>();

		for (String st : values) 
		{
			val.add(st);	
		}
		Collections.sort(val);
		for (String st : val) 
		{
			System.out.println(st);	

		}

	}

	public  Set<String> genericDataCapturefromCarousel(String SectionName) 
	{

		String xpathpreval="//h3[contains(text(),'";
		String xpathpostval= "')]";
		String combinedxpath=xpathpreval+SectionName+xpathpostval;

		String swipperxpath="/parent::div/parent::div/following-sibling::div/div[2]";
		String productnamexpath="/parent::div/parent::div/following-sibling::div//div[@data-qa='product-name']/div";

		//h3[contains(text(),'Save big on mobiles & tablets')]/parent::div/parent::div/following-sibling::div//div[@data-qa='product-name']/div
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(combinedxpath)));
		WebElement element=driver.findElement(By.xpath(combinedxpath+swipperxpath)); 
		List<WebElement> lstproductname=driver.findElements(By.xpath(combinedxpath+productnamexpath));
		System.out.println(lstproductname.size());
		while(element.isDisplayed()) 
		{

			for (WebElement ele : lstproductname) 
			{
				values.add(ele.getText());
			} 
			element.click();

		}



		return values;


	}
}
