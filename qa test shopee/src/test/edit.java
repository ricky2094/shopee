package test;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class edit {

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
	    driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[1]")).click();
	    driver.findElement(By.name("gist[description]")).sendKeys("Ini adalah deskripsi untuk test");
	    driver.findElement(By.name("gist[contents][][name]")).sendKeys("qa-gist.md");
	    driver.findElement(By.xpath("//*[@id=\"gists\"]/div[2]/div/div[2]")).click(); //sendKeys("ini adalah isi content untuk gist");
	    driver.findElement(By.xpath("//*[@id=\"gists\"]/div[2]/div/div[2]/div/div[5]/div[1]/div/div/div/div[5]")).sendKeys("ini adalah isi content untuk gist");
	    driver.findElement(By.name("gist[public]")).click();
	    
// mulai dari sini untuk edit 
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/ul/li[1]")).click();
	    driver.findElement(By.name("gist[description]")).clear();
	    driver.findElement(By.name("gist[description]")).sendKeys("Ini deskripsinya di edit");
	    driver.findElement(By.linkText(" Update public gist")).click();
	    
	    
}
}

