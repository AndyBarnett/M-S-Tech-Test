package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BagPage;
import pageObjects.HomePage;
import pageObjects.ProductCategoryPage;
import pageObjects.ProductPage;
import support.constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BagSteps {
	public WebDriver driver;
	public static HomePage homePage;
	public static ProductCategoryPage categoryPage;
	public static ProductPage productPage;
	public static BagPage bagPage;

	public BagSteps() {
		driver = Hooks.driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(constants.baseURL);
	}
	
	@Given("^I have added (a|an) shirt to my bag$")
	public void i_have_added_a_item_to_my_bag(String _plural) {
		categoryPage = homePage.clickMenCategory();
		productPage = categoryPage.clickFirstTop();
		productPage.selectVariant();
		productPage.selectSize();
		productPage.addToBag();
	}
	
	@When("^I view the contents of my bag$")
	public void i_view_the_contents_of_my_bag() {
		bagPage = productPage.goToBag();
	}
}
