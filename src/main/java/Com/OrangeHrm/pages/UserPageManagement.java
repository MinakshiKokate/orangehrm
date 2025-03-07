package Com.OrangeHrm.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Com.OrangeHrm.Keyword1;

public class UserPageManagement {

	@FindBy(css = "div.orangehrm-header-container button]")
	private WebElement addBtn;

	@FindBy(css = "div.oxd-select-text")
	private WebElement UserRoleList;

	@FindBy(xpath = "//div[@role='listbox']/descendant::*[contains(text(),'ESS')]")
	private List<WebElement> roleList;

	@FindBy(xpath = "//input[@placeholder=\\\"Type for hints...\\\"]")
	private WebElement employeeName;

	@FindBy(xpath = "//div[@role='option']/span")
	private List<WebElement> employename;

	public UserPageManagement() {
		PageFactory.initElements(Keyword1.driver, this);
	}

	public UserPageManagement clickOnSelectbtn() {
		UserRoleList.click();
		return this;

	}

	public void selectRole(String roleName) {

		for (WebElement role : roleList) {
			if (role.getText().equalsIgnoreCase(roleName)) {
				role.click();
				break;

			}

		}

	}

	public void enterEmployeeName(String employename) throws InterruptedException {
		this.employeeName.sendKeys(employename);
		Thread.sleep(5000);

	}

	public List<String> getemployenames() {
		List<String> names = new ArrayList<String>();
		for (WebElement employename : employename) {
			names.add(employename.getText());

		}
		return names;
	}

}