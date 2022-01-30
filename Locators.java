import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alekhya\\Downloads\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //class name = Chrome Driver
		// X driver = new X();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(0,null);
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Welcome");  //id
		driver.findElement(By.name("inputPassword")).sendKeys("Hello");  //name
		driver.findElement(By.className("signInBtn")).click();     //class
		
		//CSS Selector
		//for Classname = tagname.classname or .classname
		// for ID = tagname#id  or  #id
		//for Generic Syntax = Tagname[attribute='value']
		
		driver.findElement(By.cssSelector("p.error")).getText();
		
		
	}

}
