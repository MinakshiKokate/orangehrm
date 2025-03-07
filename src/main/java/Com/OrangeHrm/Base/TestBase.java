package Com.OrangeHrm.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.OrangHrm.utile.app;
import Com.OrangeHrm.Keyword1;

public class TestBase {
	@BeforeMethod
	public void teardown() {
		Keyword1 keyword = new Keyword1();
		keyword.LaunchBrowser("Chrome");
		keyword.launchUrl(app.getAppUrl("qa"));
		

	}
	@AfterMethod
	 public void tearDown() throws Exception {
	 Keyword1.driver.quit();

	 }


}
