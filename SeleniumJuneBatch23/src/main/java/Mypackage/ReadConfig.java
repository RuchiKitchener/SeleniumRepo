package Mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	static String file = "./src/main/resources/config.properties";

	public ReadConfig() {
		File src = new File(file);
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

public String getURL() {
	return prop.getProperty("url");
}
	
	
	
	public String getUsername() {
		return prop.getProperty("username");  //Standard_user
	}

	
	
	
	public String getPassword() {
		return prop.getProperty("password");
	}

	public String getUrl() {
		String s =  prop.getProperty("url");
		return s;
	}

	public String getEmail() {
		return prop.getProperty("email");
	}

	public String getincorrectusername() {
		return prop.getProperty("wrongusername");
	}

	public String getZipcode() {
		return prop.getProperty("zipcode");
	}
	public String getFirstname() {
		return prop.getProperty("firstname");
	}
	public String getLastname() {
		return prop.getProperty("lastname");
	}
	public String getWrongpassword() {
		return prop.getProperty("wrongpassword");
	}
}
