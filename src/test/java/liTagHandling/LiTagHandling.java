package liTagHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiTagHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.javatpoint.com");
		WebElement ele=driver.findElement(By.xpath("//div[@div='link']/div/ul/li/a[]"));
		System.out.println(ele);
		List <WebElement> li=driver.findElements(By.xpath("//div[@id='link']/div/ul/li"));
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i).getText());
		}
	}
}
