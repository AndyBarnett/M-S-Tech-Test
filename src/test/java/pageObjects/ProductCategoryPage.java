package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import support.constants;
import support.helpers;

public class ProductCategoryPage {
	private WebDriver driver;
	
	@FindBy(className = "grid-view")
	private WebElement grid;

	public ProductCategoryPage(final WebDriver driver){
		 this.driver = driver;
	}

	public ProductPage clickFirstTop(){
		List<WebElement> productsList = driver.findElement(By.className("grid-view")).findElements(By.tagName("li"));
		productsList.get(0).click();
		return PageFactory.initElements(driver, ProductPage.class);
	}
}
