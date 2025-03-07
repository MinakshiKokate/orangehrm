package Com.OrangeHrm.Error;

public class invalidbrowsererror extends Error {
private String browserName;
	
	public invalidbrowsererror(String browserName) {
		this.browserName = browserName;
	}
	
	
   @Override
public String getMessage() {
	
	return "Invalid browser Name:"+this.browserName;
}
	


}
