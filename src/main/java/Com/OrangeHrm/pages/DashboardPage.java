package Com.OrangeHrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Com.OrangeHrm.Keyword1;

public class DashboardPage {
	
	@FindBy(css = "a[href*=PimModule]")
	WebElement pimmenu;

	@FindBy(css = "a[href*=AdminModule]")
	private WebElement adminMenu;

	public DashboardPage() {
		PageFactory.initElements(Keyword1.driver, this);

	}

	public void clickOnPimMenu() {
		pimmenu.click();

	}

	public void waitForPimMenuToBeVisible() {
		Keyword1 keyword = new Keyword1();
		keyword.waitForElementToBeVisible(pimmenu);
	}

	public void clickonAdminMenu() {
		adminMenu.click();
	}

}
