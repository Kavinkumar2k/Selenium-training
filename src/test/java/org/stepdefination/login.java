package org.stepdefination;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class login extends baseclass{
	pojo p;
//	@Given("To Launch the chrome browser and maximize the window")
//	public void to_Launch_the_chrome_browser_and_maximize_the_window() {
//		launchBrowser();
//		windowmaximize();
//		launchurl("https://www.redbus.in/");
//	}
	@When("User has to click the Sign in button")
	public void userHasToClickTheSignInButton() throws InterruptedException {
		p=new pojo();
		Thread.sleep(3000);
		clickBtn(p.getIcon());
		clickBtn(p.getSignin());
	   
	}

	@When("USer has to pass the mobile number")
	public void userHasToPassTheMobileNumber(DataTable d) throws InterruptedException {
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		p=new pojo();
		Map<String, String> M = d.asMap(String.class, String.class);
		passText(M.get("mob2"), p.getNum());
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}



}
