package Com.OrangHrm.utile;



public class app {
	private static String baseDir = System.getProperty("user.dir");
	private static String filepath = baseDir + "\\src\\test\\resources\\Properties\\app.Properties";

	public static String getAppUrl(String env) {
		return propertiesutile.getProperty(filepath, env + ".url");
	}


}
