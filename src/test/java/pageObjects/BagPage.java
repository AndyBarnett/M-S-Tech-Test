package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.constants;
import support.helpers;

public class BagPage {
	private WebDriver driver;
	
	@FindBy(css = ".heading-product > a")
	private WebElement productName;

	public BagPage(final WebDriver driver){
		 this.driver = driver;
	}

	public String getFirstItemText(){
		helpers.waitForElement(driver, productName, constants.animationTime);
		return productName.getText();
	}

}
