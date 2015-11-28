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
	private WebElement sizeRadio;
	
	@FindBy(className = "basket")
	private WebElement addToBagButton;
	
	@FindBy(className = "header-link")
	private WebElement bagButton;

	public ProductPage(final WebDriver driver){
		 this.driver = driver;
	}

	public void selectVariant(){
		helpers.waitForElement(driver, variantSwitch, constants.animationTime);
		variantSwitch.click();
	}
	
	public void selectSize(){
		sizeRadio.click();
	}
	
	public void addToBag(){
		addToBagButton.click();
	}
	
	public BagPage goToBag() {
		bagButton.click();
		return PageFactory.initElements(driver, BagPage.class);
	}
}
