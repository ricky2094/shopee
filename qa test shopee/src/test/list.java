package test;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class list {
	 public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		   WebDriver driver;
		  String baseUrl;
		  String expectedtext = "qa-gist.md";
		  String actualtext;
		  
		  driver = new ChromeDriver();
		    baseUrl = "https://gist.github.com";
		    driver.manage().window().maximize();
		    driver.get(baseUrl);
		    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/a[2]")).click();
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.name("login")).sendKeys("********");
		    driver.findElement(By.name("password")).sendKeys("@********");
		    driver.findElement(By.name("commit")).click();
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[2]/details/summary")).click();
		    driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[2]/details/details-menu/ul/li[3]")).click();
    
}
}
