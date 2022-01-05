package Introduction.SeleniumBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink2 {
public static void main(String[] args) throws MalformedURLException, IOException {
	//Step1 get all URL tideup in links
			//java method will get you the status code
			//if status code>400 then url is not working
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			/*Step1 : Invoke browser
			 * Step2 : get to URL
			 * we will be storing all elements in List
			 * will itarate through List and write logic to verify link is bronken or not
			 * */
			driver.get("https://www.amazon.com/");
			
			List<WebElement> links=driver.findElements(By.cssSelector(""));
			SoftAssert sa=new SoftAssert();
			for(WebElement link : links ){
				String url=link.getAttribute("");
				HttpURLConnection connect=(HttpURLConnection)new URL(url).openConnection();
				connect.setRequestMethod("HEAD");
				connect.connect();
				int resCode=connect.getResponseCode();
				System.out.println(resCode);
				sa.assertTrue(resCode<400, "Message");
				
			}
			
			
			
			
			
			
			
			
			String url=driver.findElement(By.cssSelector("a[href*='linkname']")).getAttribute("href");
			
			//call openConnection method present in URL class this method return type is HttpsURLConnection  
			HttpsURLConnection c=(HttpsURLConnection)new URL(url).openConnection();
			c.setRequestMethod("HEAD");
			c.connect();
			int responseCode=c.getResponseCode();
}
}
