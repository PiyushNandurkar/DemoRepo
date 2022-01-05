package Introduction.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@class=login]")).click();
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("demo@test.com");
		driver.findElement(By.xpath("//input[@id=passwd]")).sendKeys("1234");
		driver.findElement(By.name("SubmitLogin")).click();
		
	}
}
