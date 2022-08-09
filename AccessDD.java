package seleniumWebDriverScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		Select dropCountry = new Select(driver.findElement(By.name("country")));
		dropCountry.selectByVisibleText("FRANCE");
		dropCountry.selectByValue("QATAR");
		dropCountry.selectByIndex(123);
		
		String baseURL2 = "https://output.jsbin.com/osebed/2";
		driver.get(baseURL2);
		Select fruitList = new Select(driver.findElement(By.id("fruits")));
		fruitList.selectByVisibleText("Apple");
		fruitList.selectByValue("banana");
		fruitList.selectByIndex(3);
		fruitList.deselectByValue("banana");
		fruitList.selectByIndex(1);
		fruitList.deselectAll();
		
		driver.close();

	}

}
