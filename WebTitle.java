package seleniumWebDriverScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  start up chrome
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//   start up firefox
//		System.setProperty("webdriver.gekko.driver", 
//				"C:\\Tests\\@Selenium\\Selenium Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		// start up IE
//		System.setProperty("webdriver.ie.driver", 
//				"C:\\Tests\\@Selenium\\Selenium Drivers\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		
		String baseURL = "https://www.foxnews.com";
		String expTitle = "Fox News";
		String actTitle = "";
		
		driver.get(baseURL);
		actTitle = driver.getTitle();
		System.out.println ("Expected title - " + expTitle );
		System.out.println ("Actual title - " + actTitle );
		
		if (actTitle.contentEquals(expTitle))
		{
			System.out.println("page was loaded");
		}
		else
		{
			System.out.println("page was not loaded");
		}
		
		if (actTitle.contains(expTitle))
		{
			System.out.println("fox page was loaded");
		}
		else
		{
			System.out.println("fox page was not loaded");
		}
			driver.quit();
	}

}
