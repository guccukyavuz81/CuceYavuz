package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	public static void confread(String path) {
		try {
			FileInputStream fis=new FileInputStream(path);
			prop=new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public static String getProp(String key) {
		return prop.getProperty(key);
	}
}
