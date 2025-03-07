package Com.OrangeHrm.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import Com.OrangeHrm.Keyword1;

public class PimPage {
	private Map<String, String> data;


	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(2) div:nth-of-type(1) button.oxd-button.oxd-button--medium.oxd-button--secondary")
	private WebElement add;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(2) div:nth-of-type(3) div.oxd-table.orangehrm-employee-list div:nth-of-type(1) div.oxd-table-row.oxd-table-row--with-border div:nth-of-type(1) div.oxd-checkbox-wrapper label input[type='checkbox']")
	private WebElement add1RecordFoundidfirstMiddle;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) header.oxd-topbar div:nth-of-type(2) nav.oxd-topbar-body-nav ul li:nth-of-type(3) a.oxd-topbar-body-nav-tab-item")
	private WebElement addEmployee;

	@FindBy(css = "a[href='/web/index.php/admin/viewAdminModule']")
	private WebElement admin;

	@FindBy(css = "a[href='/web/index.php/dashboard/index']")
	private WebElement dashboard;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(1) div:nth-of-type(2) form.oxd-form div:nth-of-type(1) div.oxd-grid-4.orangehrm-full-width-grid div:nth-of-type(2) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) input.oxd-input.oxd-input--active")
	private WebElement employeeId;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(1) header.oxd-topbar div:nth-of-type(2) nav.oxd-topbar-body-nav ul li:nth-of-type(2) a.oxd-topbar-body-nav-tab-item")
	private WebElement employeeList;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(1) div:nth-of-type(2) form.oxd-form div:nth-of-type(1) div.oxd-grid-4.orangehrm-full-width-grid div:nth-of-type(1) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active input")
	private WebElement employeeName;

	@FindBy(css = "a[href='/web/index.php/leave/viewLeaveModule']")
	private WebElement leave;

	private final String pageUrl = "/web/index.php/pim/viewEmployeeList";

	@FindBy(css = "a.oxd-main-menu-item.active")
	private WebElement pim;

	@FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	private WebElement search;

	@FindBy(css = "#app div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div.orangehrm-background-container div:nth-of-type(1) div:nth-of-type(2) form.oxd-form div:nth-of-type(1) div.oxd-grid-4.orangehrm-full-width-grid div:nth-of-type(5) div.oxd-input-group.oxd-input-field-bottom-space div:nth-of-type(2) div.oxd-autocomplete-wrapper div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active input")
	private WebElement supervisorName;

	@FindBy(css = "a[href='/web/index.php/time/viewTimeModule']")
	private WebElement time;

	@FindBy(css = "a.orangehrm-upgrade-link")
	private WebElement upgrade1;

	@FindBy(css = "button.oxd-glass-button.orangehrm-upgrade-button")
	private WebElement upgrade2;

	@FindBy(css = "div.orangehrm-header-container button")
	private WebElement addbtn;

	@FindBy(css = "input[name=\"firstName\"]")
	private WebElement firstName;

	@FindBy(css = "input[name=\"middleName\"]")
	private WebElement middleName;

	@FindBy(css = "input[name=\"lastName\"]")
	private WebElement lastname;

	@FindBy(css = "button[type=\"submit\"]")
	private WebElement savebtn;

	public PimPage() {
		PageFactory.initElements(Keyword1.driver, this);
	}

	public PimPage clickAddButton() {
		addbtn.click();
		return this;
	}

	public PimPage clickAddEmployeeLink() {
		addEmployee.click();
		return this;
	}

	public PimPage clickAdminLink() {
		admin.click();
		return this;
	}

	public PimPage clickDashboardLink() {
		dashboard.click();
		return this;
	}

	public PimPage clickEmployeeListLink() {
		employeeList.click();
		return this;
	}

	public PimPage clickLeaveLink() {
		leave.click();
		return this;
	}

	public PimPage clickPimLink() {
		pim.click();
		return this;
	}

	public PimPage clickSearchButton() {
		search.click();
		return this;
	}

	public PimPage setEmployeeIdTextField() {
		return setEmployeeIdTextField(data.get("EMPLOYEE_ID"));
	}

	public PimPage setEmployeeIdTextField(String employeeIdValue) {
		employeeId.sendKeys(employeeIdValue);
		return this;
	}

	public PimPage setEmployeeNameTextField() {
		return setEmployeeNameTextField(data.get("EMPLOYEE_NAME"));
	}

	public PimPage setEmployeeNameTextField(String employeeNameValue) {
		employeeName.sendKeys(employeeNameValue);
		return this;
	}

	public PimPage submit() {
		clickSearchButton();
		return this;
	}

	public void setfirstname(String firstName) {
		this.firstName.sendKeys(firstName);

	}

	public void setmiddlename(String middleName) {
		this.middleName.sendKeys(middleName);

	}

	public void setlastname(String lastname) {
		this.lastname.sendKeys(lastname);

	}

	public void clickOnSaveButton() {
		savebtn.click();
	}

}
