package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pojo.AdactinPagePojo;
import com.utils.LibGlobal;

import cucumber.api.java.en.*;

public class AdactinSteps extends LibGlobal {

	@Given("User launch the browser and navigates to hotel booking app")
	public void user_launch_the_browser_and_navigates_to_hotel_booking_app() {
		getUrl("http://adactinhotelapp.com/");
	}

	@When("User enters the credentials in hotel booking app")
	public void user_enters_the_credentials_in_hotel_booking_app() {
		AdactinPagePojo a = new AdactinPagePojo();
		insertType(a.getTxtUserName(), "hello");
		insertType(a.getTxtPass(), "1234567");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		AdactinPagePojo a = new AdactinPagePojo();
		click(a.getBtnLogIn());
	}

	@Then("User validates the error mesaage")
	public void user_validates_the_error_mesaage() {
		WebElement authMsg = driver.findElement(By.xpath("//div[@class='auth_error']"));
		Assert.assertTrue("Auth error messgae is not displayed", authMsg.isDisplayed());
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\" in hotel booking app$")
	public void user_enters_the_something_and_something_in_hotel_booking_app(String userName, String password)
			throws Throwable {
		AdactinPagePojo a = new AdactinPagePojo();
		insertType(a.getTxtUserName(), userName);
		insertType(a.getTxtPass(), password);
	}
}
