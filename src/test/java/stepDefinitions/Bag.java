package stepDefinitions;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.HomePage;
import support.constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Bag {
	public WebDriver driver;
	public static HomePage homePage;

	public Bag() {
		driver = Hooks.driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(constants.baseURL);
	}
	
	@Given("^I have added (a|an) (.*?) to my bag$")
	public void i_have_added_a_item_to_my_bag(String _plural, String product) {
		
	}
}
