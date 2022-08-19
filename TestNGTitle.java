package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGTitle {
	public String driverPath = "C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe";
	public String baseURL = "https://blackcaviaerusa.com";
	public WebDriver driver;
	
  @Test
  public void verifyHomePageTitle() {
	  String expTitle = "Black Caviar";
	  String actTitle = driver.getTitle();
	  System.out.println ("Actual title is: " + actTitle);
	  Assert.assertEquals(actTitle, expTitle);
	  if (actTitle.contains(expTitle))
	  {
		  System.out.println ("Test passed");
	  }
	  else
	  {
		  System.out.println ("Test failed");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println ("Browser starts up");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.get(baseURL);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println ("Browser is closed");
	  driver.close();
  }

}
