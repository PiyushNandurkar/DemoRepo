package Introduction.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru02 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://www.facebook.com/";
		String tagName="";
		
		driver.get(baseUrl);
		tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		WebElement element=driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("Hi_Piyush");
		driver.findElement(By.name("login")).click();
		driver.close();
		System.exit(0);
	}
}
