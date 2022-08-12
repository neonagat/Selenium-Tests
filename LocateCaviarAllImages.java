package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateCaviarAllImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tests\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
    	driver.get("https://blackcaviarusa.com/");
    	driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"ecwid_body\"]")).click();
		WebElement homeImage = driver.findElement(By.tagName("img"));
		System.out.println("Home image name: " + homeImage.getAttribute("alt"));

	
		WebElement Kaluga = driver.findElement(By.xpath("//img[starts-with(@alt,'Kaluga')]"));
		System.out.println("Kaluga Fusion: " + Kaluga.getAttribute("alt")); 
		
		
		WebElement salmonx = driver.findElement(By.xpath("//img[starts-with(@alt,'Wild')]"));
		System.out.println("Salmon XIP: "+salmonx.getAttribute("alt"));
		
		
		WebElement RoyalCaviar = driver.findElement(By.xpath("//img[starts-with(@alt,'Royal')]"));
		System.out.println("Royal Caviar: " + RoyalCaviar.getAttribute("alt"));
		
		
		WebElement Hackleback = driver.findElement(By.xpath("//img[starts-with(@alt,'Hackleback')]"));
		System.out.println("Hackleback Caviar: " + Hackleback.getAttribute("alt"));
		
		
		WebElement PeterPan = driver.findElement(By.xpath("//img[contains(@alt,'Peter')]"));
		System.out.println("Peter Pan: " + PeterPan.getAttribute("alt"));
		
		
		WebElement Paddlefish = driver.findElement(By.xpath("//img[contains(@alt,'Paddlefish')]"));
		System.out.println("Paddlefish: " + Paddlefish.getAttribute("alt"));
		
	 	driver.close();

	}

}
