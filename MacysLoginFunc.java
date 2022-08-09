package seleniumWebDriverScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacysLoginFunc {
	static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe");
		
		String baseURL = "https://www.macys.com/account/signin";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String userId = "james@cooper.edu";
		String userPsw = "student123";
		registerDetails(userId,userPsw);
		String actTitle = driver.getTitle();
		System.out.println("Actual title is: " + actTitle);
		titleVerification(actTitle);
		driver.close();
	}

	public static void titleVerification(String actTitle) {
		// TODO Auto-generated method stub
	
//	    WebElement msg = driver.findElement(By.xpath("xpath=//div[@id='ul-msg-section']/div/div/div[2]"));
//	    System.out.println("message on screen: " + msg);
		
		if (actTitle.contains("Macy's"))
		{
			System.out.println("Successfull login");
		}
		else
		{
			System.out.println("Page is not available");
		}
		
	}

	private static void registerDetails(String regId, String regPsw) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("email")).sendKeys(regId);
		driver.findElement(By.id("pw-input")).sendKeys(regPsw);
		driver.findElement(By.id("sign-in")).click();
		
	}
	
}
