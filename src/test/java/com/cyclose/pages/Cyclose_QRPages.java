package com.cyclose.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclose_QRPages 
{
  @FindBy(xpath = "//a[@id='menu_banking']")
  private WebElement bankinglink;
  
  @FindBy (xpath = "//div[text()='Receive QR-code']")
  private WebElement qrcodelink;
  
  @FindBy(xpath = "//input[@type='tel']")
  private WebElement amounttextbox;
  
  @FindBy(xpath = "//span[text()='Generate QR code']")
  private WebElement generateqrcode;
  
  @FindBy(xpath = "//div[text()=' Receive QR-code payment ']")
  private WebElement qrcodetitle;
  
  public Cyclose_QRPages(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public boolean verifybanklink()
  {
	  try 
	  {
		return bankinglink.isDisplayed();
	  } 
	  catch (Exception e) 
	  {
		return false;
	  }
  }
  public void clickonbankinglink()
  {
	  bankinglink.click();
  }
  public void clickonreceiveqrcode() 
  {
	  qrcodelink.click();
  }
  public void enteramount(String amt)
  {
	  amounttextbox.clear();
	  amounttextbox.sendKeys(amt);
  }
  public void clickgeneratebutton()
  {
	  generateqrcode.click();
  }
  public boolean qrcodetitle()
  {
	  try 
	  {
		return qrcodetitle.isDisplayed();
	  } 
	 catch (Exception e) 
	  {
		return false;
	  }
  }
  
  }
	
