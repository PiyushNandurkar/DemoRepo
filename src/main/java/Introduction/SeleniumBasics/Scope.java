package Introduction.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Links present in footer section
		WebElement footerDriver=driver.findElement(By.className("navFooterMoreOnAmazon"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
//		WebElement columnDriver=driver.findElement(By.xpath("//*[@id="navFooter"]/div[1]/div/div[1]/ul"));
//		System.out.println(columnDriver.findElements(By.tagName("a")));
		
		for(int i=0;i<footerDriver.findElements(By.tagName("a")).size();i++){
			
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			footerDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);;
		}
		
		driver.close();
	}
	
}
