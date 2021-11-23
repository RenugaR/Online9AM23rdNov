package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;
	/*
	 * To initialize the Webdriver
	 */

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Online9AMNov15Project\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	/*
	 * To enter the url
	 */

	public static void getUrl(String url) {
		driver.get(url);
	}

	/*
	 * To geth the title of the application
	 */

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	/*
	 * To get the current url of the application
	 */

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	/*
	 * Close the current browser tab or window
	 */

	public static void closeBrowser() {
		driver.close();
	}

	/*
	 * To close all browser window or tab
	 */

	public static void quitBrowser() {
		driver.quit();
	}

	/*
	 * To click button or link or checkbox or radio button
	 */

	public static void click(WebElement ele) {
		ele.click();
	}

	/*
	 * To pass the values into textbox
	 */
	
	public void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
	}
}
