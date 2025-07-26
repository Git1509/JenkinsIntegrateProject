package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestBase {

	@Test
	public void testJob() {
		System.out.println("entered into chrome");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		//adding comments here//
	}
	}

