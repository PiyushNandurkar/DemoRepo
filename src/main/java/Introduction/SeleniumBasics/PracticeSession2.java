package Introduction.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSession2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//TagName and ID
		driver.findElement(By.cssSelector("#email")).sendKeys("Piyushnandurkar");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Dp@12345");
		
		//Tagname and Class(Class means you have to send value of class)
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("hello world");
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("Hello world");
		
		//Tag and Attribute
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Hey");
		driver.close();
		
		//Tag and attribute
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("Data");
	}
}
