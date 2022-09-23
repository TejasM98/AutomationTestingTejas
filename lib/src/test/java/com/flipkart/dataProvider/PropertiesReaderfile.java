package com.flipkart.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class PropertiesReaderfile {
	
	private Properties prop;
	private final String propertyFilePath="application.properties";
	
	public PropertiesReaderfile() {
		BufferedReader reader;
		try {
			reader= new BufferedReader(new FileReader(propertyFilePath));
			prop= new Properties();
			try {
				prop.load(reader);
				reader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("application.properties not found at " + propertyFilePath);
		}
	}
	
	public String getEmailID() {
		String email = prop.getProperty("EmailID");
		/*byte[] encodedBytes = Base64.getEncoder().encode(email.getBytes());
		if(email!= null)
			return new String(encodedBytes);
		else
			throw new RuntimeException("Email not specified in the application.properties file.");
	}*/
		return email;
	}
	
	public String getPassword() {
		String pass = prop.getProperty("Password");
		/*byte[] encodedBytes = Base64.getEncoder().encode(pass.getBytes());
		if(pass!= null)
			return new String(encodedBytes);
		else
			throw new RuntimeException("Password not specified in the application.properties file.");
	}*/
		return pass;
	}
}
