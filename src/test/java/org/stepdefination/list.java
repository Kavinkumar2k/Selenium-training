package org.stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class list extends baseclass{
	pojo p;
	@When("User click the sign in button")
	public void userClickTheSignInButton() throws InterruptedException {
	     p=new pojo();
	     Thread.sleep(3000);
			clickBtn(p.getIcon());
			clickBtn(p.getSignin());
	}

	@When("User pass the mobile number in to the mobile number field")
	public void userPassTheMobileNumberInToTheMobileNumberField(DataTable d) throws InterruptedException {
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		p=new pojo();
		List<String> l = d.asList();
		passText(l.get(1), p.getNum());
	    
	}

}
