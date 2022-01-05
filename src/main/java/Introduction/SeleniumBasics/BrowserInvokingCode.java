package Introduction.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvokingCode {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.out.println("Invoked Successfully");
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());//will give page title
		System.out.println(driver.getCurrentUrl());//Will give URL 
		driver.close();//only current Window will be closed
		driver.quit();//Will close all windows opened by selenium webdriver
		
	}
}
