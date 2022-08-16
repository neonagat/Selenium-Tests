package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateImagesLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tests\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
		driver.get("https://blackcaviarusa.com/");
		driver.manage().window().maximize();
		
		List <WebElement> linkElements = driver.findElements(By.tagName("img"));
		String [] linkTexts = new String[linkElements.size()];
		System.out.println("No of images on page = " + linkElements.size());
		
		int i = 0;
		String LinkName;
		
		for (WebElement e: linkElements)
		{
			linkTexts[i] = e.getAttribute("alt");
			LinkName = e.getText();
			System.out.println(linkTexts[i]);
			if (linkTexts[i].isEmpty())
			{
				System.out.println(LinkName +" Missing alt attribute " + linkTexts[i]);
			}
			else
			{
				System.out.println(LinkName + " alt attribute " + linkTexts[i]);
			}
			i++;
		}
		driver.close();
	}

}

