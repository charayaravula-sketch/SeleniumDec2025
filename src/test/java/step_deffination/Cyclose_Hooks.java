package step_deffination;

import com.cyclosebasic.Cyclose_Common;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Cyclose_Hooks 
{
  @Before
  public void setup() 
  {
	  Cyclose_Common.launchBrowser();
  }
	@After
	public void teardown() throws Exception
	{
		Cyclose_Common.closebrowser();
	}
	
  @Before("@Excel")
  public void openExcel()
  {
	 System.out.println("---open the Excel sheet");
  }
  @After("@Excel")
  public void closeExcel()
  {
	  System.out.println("---close the Excel sheet");
  }
  
}
