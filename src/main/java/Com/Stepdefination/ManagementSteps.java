package Com.Stepdefination;
import java.util.List;

import org.testng.Assert;

import Com.OrangHrm.utile.app;
import Com.OrangeHrm.Keyword1;
import Com.OrangeHrm.pages.DashboardPage;
import Com.OrangeHrm.pages.LoginPage;
import Com.OrangeHrm.pages.PimPage;
import Com.OrangeHrm.pages.UserPageManagement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagementSteps {

	@Given("Application url is launched")
	public void launchAppUrl() {
		Keyword1 keyword = new Keyword1();
		keyword.LaunchBrowser("Chrome");
		keyword.launchUrl(app.getAppUrl("qa"));

	}

	@Then("Enter the valid username")
	public void enter_the_valid_username() throws InterruptedException {
		LoginPage Loginpage = new LoginPage();
		Thread.sleep(3000);
		Loginpage.enterUsername("Admin");
	}

	@Then("Enter the valid password")
	public void enter_the_valid_password() {
		LoginPage Loginpage = new LoginPage();
		Loginpage.enterPassword("admin123");
	}

	@Then("Click on the sumbit button")
	public void click_on_the_sumbit_button() {
		LoginPage Loginpage = new LoginPage();
		Loginpage.clickOnLoginBtn();

	}

	@When("User clicks on PIM menu")
	public void user_clicks_on_pim_menu() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage();
		Thread.sleep(3000);
		dashboard.waitForPimMenuToBeVisible();
		dashboard.clickOnPimMenu();
	}

	@And("User clicks on Add button")
	public void user_clicks_on_add_button() throws InterruptedException {
		PimPage pimpage = new PimPage();
		Thread.sleep(5000);
		pimpage.clickAddButton();
	}
	
	@And("Creates and user with valid details")
	public void creates_and_user_with_valid_details() throws InterruptedException {
		PimPage pimpage = new PimPage();
		Thread.sleep(6000);
		pimpage.setfirstname("minakshi");
		pimpage.setmiddlename("subrav");
		pimpage.setlastname("kokate");
		pimpage.clickOnSaveButton();
	}
	@When("User clicks in Admin menu")
	public void user_clicks_in_admin_menu() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage();
		Thread.sleep(7000);
		dashboard.clickonAdminMenu();

	}
	@And("Click on Add button on user management  page")
	public void click_on_add_button_on_user_management_page() throws InterruptedException {
		PimPage pimpage = new PimPage();
		Thread.sleep(8000);
		pimpage.clickAddButton();

	}
	@When("User selects role as ESS")
	public void user_selects_role_as_ess() throws InterruptedException {
		UserPageManagement usermgmt = new UserPageManagement();
		usermgmt.selectRole("ESS");

	}
	
	@And("Enters name as Employe name")
	public void enters_name_as_employe_name() throws InterruptedException {
		UserPageManagement usermgmt = new UserPageManagement();
		usermgmt.enterEmployeeName("minakshi");

	}
	@Then("Populated list must contain newly created user")
	public void populated_list_must_contain_newly_created_user() {
		UserPageManagement usermgmt = new UserPageManagement();
		List<String> names = usermgmt.getemployenames();
		Assert.assertTrue(names.contains("minakshi"));
	}
}
