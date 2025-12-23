package com.cyclosebasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cyclose_Common 
{
  public static WebDriver d;
  public static String browser = "GC";
	
	
  public static void launchBrowser()
  {
	  if(browser.equals("FF"))
	  {
		  d = new FirefoxDriver();
	  }
	  else if(browser.equals("GC"))
	 {
		 d = new ChromeDriver();
	 }
	 else if(browser.equals("Edge"))
	 {
		  d = new EdgeDriver();
	 }
	
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
	}
	
	public static void closebrowser() throws Exception
	{
		Thread.sleep(3000);
		d.quit();
	}
	  
  }
  
