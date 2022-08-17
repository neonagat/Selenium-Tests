package seleniumWebDriverScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MacysReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ca-profile-firstname")).sendKeys("Mickey");
		driver.findElement(By.id("ca-profile-lastname")).sendKeys("Mouse");
		driver.findElement(By.id("ca-profile-email")).sendKeys("mickey@cooper.edu");
		driver.findElement(By.id("ca-profile-password")).sendKeys("tester123");
		
		Select dropMonth = new Select(driver.findElement(By.id("ca-profile-birth-month")));
		dropMonth.selectByVisibleText("June");
		Select dropDay = new Select(driver.findElement(By.id("ca-profile-birth-day")));
		dropDay.selectByVisibleText("15");
		Select dropYear = new Select(driver.findElement(By.id("ca-profile-birth-year")));
		dropYear.selectByIndex(10);
		
		driver.findElement(By.id("ca-profile-submit")).click();
		
		driver.close();	
		

	}

}
