package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateHomePageImageCaviar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Tests\\Selenium Newer version\\Selenium Drivers\\drivers\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();	
        driver.get("https://blackcaviarusa.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id=\"ecwid_body\"]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/a/img")).click();
        WebElement homeImage = driver.findElement(By.tagName("img"));
        
        System.out.println(" home image name: " + homeImage.getAttribute("alt"));
        
       // driver.close();
        
     	}

}
