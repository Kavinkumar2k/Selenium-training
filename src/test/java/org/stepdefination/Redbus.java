package org.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class Redbus extends baseclass{
	pojo p;
	@When("To click the sign in button")
	public void toClickTheSignInButton() {
	   p=new pojo();
	   clickBtn(p.getIcon());
	   clickBtn(p.getSignin());
	}

	@When("To pass the valid mobile number in to the{string} mobile number field")
	public void toPassTheValidMobileNumberInToTheMobileNumberField(String num) throws InterruptedException {
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
	    passText(num, p.getNum());
	}


}
