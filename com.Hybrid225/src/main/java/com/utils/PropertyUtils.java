package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtils {
	
	public static String readProperty(String key) throws Exception {
		
		String path=System.getProperty("user.dir")+"/src/main/resources/config.property";//dynamic path
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(path);
		
		prop.load(fis);
		return prop.getProperty(key);
	}
	
//	public static void main(String[] args) throws Exception { want to run
//		System.out.println(readProperty("browser"));
//	}

}
