package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//capture links
		//count number of link
		//Every links starts with anchor tag<a>
		driver.get("https://www.redbus.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++){
			//by using href attribute we can get url of required link
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			
			//Step to Establish the connection
			URL link=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			httpcon.connect();
			
			//Capture the Response Code
			int responsecod=httpcon.getResponseCode();
			if(responsecod>400){
				System.out.println(url+" - "+ " URL is Broken");
			}else{
				System.out.println(url+" - "+" URL is Valid");
			}
			
		}
		
		
	
	}
}
