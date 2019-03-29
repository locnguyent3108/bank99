package com.bankguru99;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {
	private WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://google.com");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
