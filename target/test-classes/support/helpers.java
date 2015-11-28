package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helpers {
	
	public static final void waitForElement(WebDriver driver, WebElement ele, int timeout){
		WebDriverWait pageLoadWait = new WebDriverWait(driver, timeout);
		pageLoadWait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static final void waitForElementText(WebDriver driver, WebElement ele, String expectedText, int timeout){
		WebDriverWait pageLoadWait = new WebDriverWait(driver, timeout);
		pageLoadWait.until(ExpectedConditions.textToBePresentInElement(ele, expectedText));
	}
}
