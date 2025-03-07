package Com.OrangeHrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import Com.OrangeHrm.Keyword1;

public class LoginPage {

	@FindBy(css = "input[name=\"username\"]")
	WebElement usernameTxt;

	@FindBy(css = "input[name=\"password\"]")
	WebElement passwordTxtbx;

	@FindBy(css = "button[type=\"submit\"]")
	WebElement loginbtn;

	public void enterUsername(String username) {
		usernameTxt.sendKeys(username);
	}

	public LoginPage() {
		PageFactory.initElements(Keyword1.driver, this); // this is use for current class instance
	}

	public void enterPassword(String password) {
		passwordTxtbx.sendKeys(password);

	}

	public void clickOnLoginBtn() {
		loginbtn.click();
	}

}
