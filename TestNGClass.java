package testngScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGClass {

	@Test(priority = 2)
	public void launchGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Tests\\Selenium Newer version\\Selenium Drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String expectedTitle = "Fresh American Black Caviar, Sturgeon Caviar, Wild Salmon Red Caviar | Black Caviar USA";
		 
		driver.get("https://blackcaviarusa.com");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle().contains(expectedTitle), true);
	}

	private WebDriver driver;
	private String baseUrl;
	// private boolean acceptNextAlert = true;
	// private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Method 1: Open Chrome Browser
	@Test(priority = 1)
	public void openBrowser() {
		driver = new ChromeDriver();
		System.out.println("Method 1: Open Chrome Browser");
	}

	// Method 2: Launch Google.com
	@Test(priority = 1)
	public void launchFB() {
		driver = new ChromeDriver();
		baseUrl = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.get("http://www.cnn.com");
		driver.get(baseUrl);
		System.out.println("Method 2: Launch google page");
	}

	// Method 3: Perform a search using "Facebook"
	@Test(priority = 3)
	public void peformSeachAndClick1stLink() {
	//	driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
	 	System.out.println("Method 3: Perform a search using Facebook");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("student");
		driver.findElement(By.id("loginbutton")).click();
		

		String actualTitle = driver.getTitle();
		System.out.println("actualTitle - " + actualTitle);
		if (actualTitle.contentEquals("Log into Facebook | Facebook")){
		System.out.println("Test Passed!");
		} else {
		System.out.println("Test Failed");
		}
		
		if (actualTitle.contains("Facebook")){
			System.out.println("Test partial match Passed!");
			} else {
			System.out.println("Test partial match Failed");
			}

	}

	// Method 4: Verify Google search page title.
	@Test(priority = 4)
	public void FaceBookPageTitleVerification() throws Exception {
	//	driver.findElement(By.xpath("//li/div/div")).click();
		String title = driver.getTitle();
		System.out.println("====== " + driver.getTitle());
	//	driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.xpath(".//*[@value='Search']")).click();
		//*[@id="tsf"]/div[2]/div[1]/div[3]/center/input[1]
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("Facebook"), true);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
