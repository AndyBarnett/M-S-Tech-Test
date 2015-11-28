package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.constants;
import support.helpers;

public class BagPage {
	private WebDriver driver;
	
	@FindBy(className = "glimmer-container")
	private WebElement variantSwitch;

	public BagPage(final WebDriver driver){
		 this.driver = driver;
	}

	public void selectVariant(){
		helpers.waitForElement(driver, variantSwitch, constants.animationTime);
		variantSwitch.click();
	}

}
