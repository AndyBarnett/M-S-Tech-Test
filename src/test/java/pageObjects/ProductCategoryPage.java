package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryPage {
	private WebDriver driver;
	public String firstProductName;

	public ProductCategoryPage(final WebDriver driver){
		 this.driver = driver;
	}

	public ProductPage clickFirstTop(){
		List<WebElement> productsList = driver.findElement(By.className("grid-view")).findElements(By.tagName("li"));
		WebElement firstProduct = productsList.get(0);
		firstProductName = firstProduct.findElement(By.cssSelector("h3[itemprop='name']")).getText();
		firstProduct.click();
		return PageFactory.initElements(driver, ProductPage.class);
	}
}
