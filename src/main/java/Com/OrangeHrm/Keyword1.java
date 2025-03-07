package Com.OrangeHrm;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import Com.OrangeHrm.Error.invalidbrowsererror;



public class Keyword1 {
	
	public static RemoteWebDriver driver = null;
	public static FluentWait<WebDriver> wait = null;

	public void LaunchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Launched Chrome Browser");

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Launched firefox Browser");

		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
			System.out.println("Launched safari Browser");
		}else {
			throw new invalidbrowsererror(browserName);
		}

		wait = new FluentWait<WebDriver>(Keyword1.driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class);

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterText(String locator, String textToEnter) {
		driver.findElement(By.xpath(locator)).sendKeys(textToEnter);

	}

	public void enterText(String locatorType, String locatorValue, String textToEnter) {// do method ke name same hai
		// list of arguments differnt
		// hai iss hai overloading
		// kahate hai
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);

		} else if (locatorType.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
		} else if (locatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorValue)).sendKeys(textToEnter);

		} else if (locatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locatorValue)).sendKeys(textToEnter);
		} else if (locatorType.equalsIgnoreCase("tagname")) {
			driver.findElement(By.tagName(locatorValue)).sendKeys(textToEnter);
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(locatorValue)).sendKeys(textToEnter);
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(textToEnter);
		} else {
			throw new InvalidSelectorException(locatorType);
		}
	}

	public void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	public void click(String LocatorType, String LocatorValue) {
		if (LocatorType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("tagname")) {
			driver.findElement(By.tagName(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("linktext")) {
			driver.findElement(By.linkText(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("partiallinktext")) {
			driver.findElement(By.partialLinkText(LocatorValue)).click();
		} else if (LocatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(LocatorValue)).click();
		} else {
			throw new InvalidSelectorException(LocatorType);
		}

	}
	public WebElement waitForElementToBeVisible(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by);
	}

	public WebElement waitForElementToBeVisible(WebElement element) {
		
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}



}
