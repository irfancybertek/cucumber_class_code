package stepDefinationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerPackage.TestRunner;

public class stepDefination extends TestRunner{
	WebElement search_box;
	@Given("^I navigate to google homepage$")
	public void i_navigate_to_google_homepage(){
	    driver.get("http://google.com");
	}
	

	@When("^I enter a keyword to search$")
	public void i_enter_a_keyword_to_search(){
		search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("porsche");
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button(){
		search_box.sendKeys(Keys.ENTER);
	}

	@Then("^I should be able to see the title contains the keyword$")
	public void i_should_be_able_to_see_the_title_contains_the_keyword() {
		Assert.assertTrue(driver.getTitle().contains("porsche"));
	}
}
