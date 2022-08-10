package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Tests\\Selenium Newer version\\Selenium Drivers\\drivers\\chromedriver.exe");				
        WebDriver driver = new ChromeDriver();	
        
        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        	
        email.sendKeys("selenium222@gmail.com");
        password.sendKeys("student");
        
        email.clear();
        password.clear();
        
        email.sendKeys("selenium@gmail.com");
        password.sendKeys("student");
        
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();  
        
        
        driver.get("http://demo.guru99.com/test/radio.html");
        WebElement  radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement  radio2 = driver.findElement(By.id("vfb-7-2"));
        
        radio1.click();
        System.out.println("radio button option1 is selected");
        
        radio2.click();
        System.out.println("radio button option2 is selected");
        
        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        if (checkbox1.isSelected()) {
        	System.out.println("checkbox1 is toggled on");
        } else {
        	System.out.println("checkbox1 is toggled off");
        }
        
        for (int i=0; i<2; i++)
        {
        	checkbox1.click();
        	System.out.println("checkbox1 is " + checkbox1.isSelected());
        }
        
      //  driver.close();
        
        
      
        

	}

}
