package step_deffination;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import com.cyclose.pages.cyclose_pages;
import com.cyclosebasic.Cyclose_Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cyclose_Logintestscript extends Cyclose_Common
{
	cyclose_pages lp;
	
	@Given("If user is on home page")
	public void if_user_is_an_home_page() 
	{
	   d.get("https://demo.cyclos.org/ui/home");
	}
	@When("click on login link")
	public void click_on_login_link() 
	{
	    lp = new cyclose_pages(d);
	    lp.clickonloginlink();
	}
	@When("Enter the username {string} and password {string}")
	public void enter_the_username_and_password(String user, String pass) {
		lp.enterthename(user);
	    lp.enterthepassword(pass);
	}
	@When("click on submit button")
	public void click_on_submit_button() 
	{
	    lp.clickonsubmitbutton();
	}
	@When("check error message")
	public void check_error_message() 
	{
	  assertEquals(lp.blankErrorMessage(), "This field is required");   
	}
	
	@Then("check the logout link")
	public void check_the_logout_link() throws Exception 
	{
	   assertTrue(lp.checklogout());
	   lp.clickonlogout();
	}
	
	
}
