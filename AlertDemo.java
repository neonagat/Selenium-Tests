package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException { //throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Tests\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message before accept		
        System.out.println(alertMessage);	
        Thread.sleep(2000);
        
     // Displaying alert message after accept
        alert = driver.switchTo().alert();
        alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        		
        // Accepting alert		
        alert.accept();	
        driver.close();
    }	


}
