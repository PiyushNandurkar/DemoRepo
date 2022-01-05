package Introduction.SeleniumBasics;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws IOException {
		//Step1 get all URL tideup in links
		//java method will get you the status code
		//if status code>400 then url is not working
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		String url=driver.findElement(By.cssSelector("a[href*='linkname']")).getAttribute("href");
		
		//call openConnection method present in URL class this method return type is HttpsURLConnection  
		HttpsURLConnection c=(HttpsURLConnection)new URL(url).openConnection();
		c.setRequestMethod("HEAD");
		c.connect();
		int responseCode=c.getResponseCode();
		
	}
}
