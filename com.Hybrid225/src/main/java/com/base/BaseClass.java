package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.PropertyUtils;

public class BaseClass {
	
	public static WebDriver driver=null;
	
	public  static void initialization() throws Exception {
		String browserName=PropertyUtils.readProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browserName.equals("firefox")) {
			System.setProperty("webDriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(PropertyUtils.readProperty("url"));
	}
	public static void main(String[] args) throws Exception {
		initialization();
		
	}
}
