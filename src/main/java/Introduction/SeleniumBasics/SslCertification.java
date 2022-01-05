package Introduction.SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertification {
public static void main(String[] args) {
	/*//Desired capabilities is a class which let you to customize your chrome browser
	DesiredCapabilities c=DesiredCapabilities.chrome;
	ch.acceptInsecureCerts();
	
	ChromeOptions c1=new ChromeOptions();
	c1.merge(ch);*/
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().deleteCookieNamed("");
	
	
	
	
}
}
