package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingData {
	
	public static final String path = "./src//main//resources//data//data.properties";
	Properties prop;
	FileInputStream fis;
	File file;
	public ReadingData() throws IOException {
		try {
			file = new File(path);
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		prop.load(fis);
	}
	
	public String getEmail() {
		return prop.getProperty("emailid");
	}

	
	public String getFName() {
		return prop.getProperty("fName");
	}
	
	public String getlName() {
		return prop.getProperty("lName");
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	public String getPassword() {
		return prop.getProperty("password");
	}	
}
