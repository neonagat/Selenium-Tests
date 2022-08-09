package seleniumWebDriverScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacysLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.macys.com/account/signin";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("james@cooper.edu");
		driver.findElement(By.id("pw-input")).sendKeys("student123");
		driver.findElement(By.id("sign-in")).click();
		
		String actTitle = driver.getTitle();
		System.out.println("Actual title is: " + actTitle);
		if (actTitle.contains("Macy's"))
		{
			System.out.println("Successfull login");
		}
		else
		{
			System.out.println("Page is not available");
		}
		driver.close();
	}
	
}
