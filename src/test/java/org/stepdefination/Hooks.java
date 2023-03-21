package org.stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  extends baseclass{
	@Before
	public void precondition() {
		launchBrowser();
		windowmaximize();
		launchurl("https://www.redbus.in/");
	}
	@After
	public void postcondition() {
//		closeEntireBrowser();
	}

}
