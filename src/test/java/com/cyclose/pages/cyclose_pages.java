package com.cyclose.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cyclose_pages 
{
   @FindBy(id="login-link")
   private WebElement loginlink;
   
   @FindBy(xpath="//input[@type='text']")
   private WebElement usernametextbox;
   
   @FindBy(xpath="//input[@type='password']")
   private WebElement passwordtextbox;
   
   @FindBy(xpath ="(//button[@type='button'])[2]")
   private WebElement submitbutton;
   
   @FindBy(xpath="//a[@id='logout-trigger']")
   private WebElement logoutlink;
   
   @FindBy(xpath = "//div[@class='invalid-feedback']")
   private WebElement usernameerrormessage;
   
   public cyclose_pages(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public boolean checkthelogin()
   {
	   try 
	   {
		 return loginlink.isDisplayed();
		   
	   } catch (Exception e) 
	   {
		 return false;
	   }
	   }
	public void clickonloginlink()
	{
		loginlink.click();
	}
 
   public void enterthename(String uname)
   {
	   usernametextbox.clear();
	   usernametextbox.sendKeys(uname);
   }
   public void enterthepassword(String pass)
   {
	   passwordtextbox.clear();
	   passwordtextbox.sendKeys(pass);
   }
   public void clickonsubmitbutton()
   {
	   submitbutton.click();
   }
   public boolean checklogout()
   {
	   try 
	   {
		return logoutlink.isDisplayed();
	   } catch (Exception e) 
	   {
		 return false;
	   }
   }
	public void clickonlogout()
	{
		logoutlink.click();
	}
	
	public String blankErrorMessage()
	{
		return usernameerrormessage.getText();
	}
   
   public void fillingloginData(String username, String password)
   {
	   checkthelogin();
	   clickonloginlink();
	   enterthename(username);
	   enterthepassword(password);
	   clickonsubmitbutton();  
   }
	
	
}	

