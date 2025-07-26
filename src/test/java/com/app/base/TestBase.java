package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		//adding comments here
	}
}
