package Introduction.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualString = "";
		driver.get(baseURL);
		actualString = driver.getTitle();
		System.out.println(actualString);
		if (actualString.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}else{
			System.out.println("Test Failed");
		}

	}
}
