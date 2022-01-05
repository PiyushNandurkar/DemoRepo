package Introduction.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.id("email")).sendKeys("Piyushnandurkar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dp@098765432");
		driver.findElement(By.name("commit")).click();
		//System.out.println(driver.findElement(By.cssSelector("div.bodySmall m-b-3-xs text-center-xs auth-flash-error")).getText());//CssSelector
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@dot.com");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
	}
}

