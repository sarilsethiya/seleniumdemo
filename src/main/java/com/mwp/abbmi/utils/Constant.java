package com.mwp.abbmi.utils;

public class Constant {

	/** Config Properties file **/
	public final static String CONFIG_PROPERTIES_DIRECTORY = "com\\mwp\\abbmi\\properties\\config.properties";

	public final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\mwp\\abbmi\\resources\\other\\geckodriver.exe";

	public final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\mwp\\abbmi\\resources\\other\\chromedriver.exe";

	public final static String IE_DRIVER_DIRECTORY = System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\mwp\\abbmi\\resources\\other\\IEDriverServer.exe";
	
	//Added general path
	public final static String DOWNLOADS_DIRECTORY = System.getProperty("user.home") + "\\Downloads";
}
  