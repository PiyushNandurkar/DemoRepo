package Introduction.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSession {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//div[2]/div/ul/li[9]")).getText();
		System.out.println(text);
		//List<WebElement> totalTags=driver.findElements(By.tagName("a"));
		//System.out.println(totalTags);
		//driver.close();
	}
}
