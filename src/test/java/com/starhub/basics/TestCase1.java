package com.starhub.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 
{
	
	
	public static WebDriver driver ;
	
	@BeforeMethod
	public void launchApp()
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
		
	}
	
	@AfterMethod
	public void closeApp()
	{
	
		driver.close();
	}
	
	@Test
	public void doLogin()
	{
		
		
		
		boolean falg = true;
		
		Assert.assertTrue(falg);
	}
	
	
	public void doRegistration()
	{
		
		boolean flag = true;
		
		Assert.assertTrue(flag);
	}

}
