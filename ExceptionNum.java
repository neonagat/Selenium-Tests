package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int x=0;
			int y=5;
			
			System.out.println(y/x);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("222 " + e.toString());
			System.out.println("333 " + e.getMessage());
			System.out.println("444 " + e.getStackTrace());
			
		}
		
		
		System.out.println("Continue script");
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Tests\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver(); 	
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("555 " + e.toString());
			System.out.println("666 " + e.getMessage());
			System.out.println("777 " + e.getStackTrace());
		}
		
    	
    	System.out.println("I am still continue script");

 	}

}
