package seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Tests\\Selenium Newer version\\Selenium Drivers\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.google.com/";

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		System.out.println("Total number of links = " + linkElements.size());
		int i = 0;

		for (WebElement e : linkElements) {

			System.out.println("validate link: " + e.getText()); 
			if (e.getText().isEmpty() || e.getText().contentEquals("Settings")) {
				System.out.println("this is not a link ==> skip from validation");
			} else {
				linkTexts[i] = e.getText();
				System.out.println(i + ". " + linkTexts[i]);
				i++;
			}
			
		}
		System.out.println("Total number of validated links = " + i);
		// verify link name
		for (String t : linkTexts) {
			try  
			{
					driver.findElement(By.linkText(t)).click();
					Thread.sleep(2000);
					System.out.println("\"" + t + "\"" + " has title: " + driver.getTitle());
					if (driver.getTitle().contains("Google"))
					{
						System.out.println("link validation passed for - " + t);
					}
					driver.navigate().back();
					 
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}

		}

	 driver.quit();
	}

}