package Introduction.SeleniumBasics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void addItem(WebDriver driver){
    	 List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
         for(int i=0;i<products.size();i++)
         	{
         	
         	String productName[]=products.get(i).getText().split("-");
         	String formattedName=productName[0].trim();
         	List itemsNeededList=Arrays.asList(formattedName);
         	if(itemsNeededList.contains(formattedName)){
         		//click on add to cart
         		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
         	}
         	
         }
    }
}
