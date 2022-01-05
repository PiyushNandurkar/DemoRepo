package Introduction.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dec6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="http://demo.guru99.com/test/newtours/";
		driver.get(baseURL);
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test passed");
		}else{
			System.out.println("Test Failed");
		}
		driver.close();
	}
}
