package step_deffination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.cyclose.pages.Cyclose_QRPages;
import com.cyclosebasic.Cyclose_Common;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cyclose_QRTestScript extends Cyclose_Common
{
	Cyclose_QRPages qr;

	@When("Click on Banking link and received QR code")
	public void click_on_banking_link_and_received_qr_code() 
	{
		qr = new Cyclose_QRPages(d);
	    qr.verifybanklink();
		qr.clickonbankinglink();
		qr.clickonreceiveqrcode();
	}
	@When("Enter the amount {string}")
	public void enter_the_amount(String amount) throws Exception 
	{
		Thread.sleep(3000);
	   qr.enteramount(amount);
	}
	@When("Click on Generate QRcode")
	public void click_on_generate_q_rcode() 
	{
	    qr.clickgeneratebutton();
	}
	@Then("Check QR code title")
	public void check_qr_code_title() 
	{
	   assertTrue(qr.qrcodetitle());
	}
	
	
	
}
