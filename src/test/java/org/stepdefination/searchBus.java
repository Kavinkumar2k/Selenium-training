//package org.stepdefination;
//
//import cucumber.api.java.en.When;
//
//public class searchBus extends baseclass{
//	pojo p;
//	
//	@When("User has to select the From destination")
//	public void userHasToSelectTheFromDestination() throws InterruptedException {
//	  p = new pojo();
//	  passText("erode", p.getFrom());
//	  Thread.sleep(3000);
//	  clickBtn(p.getErode());
//	}
//
//	@When("User has to select the To destination")
//	public void userHasToSelectTheToDestination() throws InterruptedException {
//	   passText("banglore", p.getTo());
//	   Thread.sleep(3000);
//	   clickBtn(p.getBan());
//	}
//
//	@When("User has to select the travel date")
//	public void userHasToSelectTheTravelDate() throws InterruptedException {
//	   clickBtn(p.getDate());
//	   Thread.sleep(3000);
//	   clickBtn(p.getDay());
//	}
//
//	@When("User has to click the search bus button")
//	public void userHasToClickTheSearchBusButton() {
//	   clickBtn(p.getSearch());
//	}
//
//
//}
