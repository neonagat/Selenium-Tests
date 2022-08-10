package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBox {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", 
				"C:\\Tests\\@Selenium\\Selenium Drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String alertMessage = "";
      
        driver.get("http://jsbin.com/usidix/1");
      //  driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        driver.findElement(By.xpath("/html/body/input")).click();
    
        try {
			Thread.sleep(2000);
			alertMessage = driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	        System.out.println(alertMessage);
		} catch (InterruptedException e) {
			e.printStackTrace();
			e.getMessage();
		}
     
         driver.quit();
       
    }
}
