package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.constants;
import support.helpers;

public class ProductPage {
	private WebDriver driver;
	
	@FindBy(className = "glimmer-container")
	private WebElement variantSwitch;
	
	@FindBy(css = "label[for='SDUMMY']")
	private WebElement smallSizeRadio;
	
	@FindBy(css = "input[value='add to bag']")
	private WebElement addToBagButton;
	
	@FindBy(id = "viewBagCountHeader")
	private WebElement bagTotal;
	
	@FindBy(className = "header-link")
	private WebElement bagButton;

	public ProductPage(final WebDriver driver){
		 this.driver = driver;
	}

	public void selectVariant(){
		variantSwitch.click();
	}
	
	public void selectSize(){
		smallSizeRadio.click();
	}
	
	public void addToBag(){
		addToBagButton.click();
		helpers.waitForElementText(driver, bagTotal, "1", constants.addToBagTime);
	}
	
	public BagPage goToBag() {
		bagButton.click();
		return PageFactory.initElements(driver, BagPage.class);
	}
}
