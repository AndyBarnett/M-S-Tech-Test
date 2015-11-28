package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.constants;
import support.helpers;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(id = "SC_Level_1_586")
	private WebElement menCategory;
	
	@FindBy(linkText = constants.topsLinkText)
	private WebElement topsLink;

	public HomePage(final WebDriver driver){
		 this.driver = driver;
	}

	public ProductCategoryPage clickMenCategory(){
		helpers.waitForElement(driver, menCategory, constants.pageLoadTime);
		
		Actions action = new Actions(driver);
		action.moveToElement(menCategory).build().perform();
		
		helpers.waitForElement(driver, topsLink, constants.animationTime);
		topsLink.click();
		return PageFactory.initElements(driver, ProductCategoryPage.class);
	}
}
