import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alekhya\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //class name = Chrome Driver
		
		// X driver = new X();
		
		driver.get("https://www.google.com"); // hits url on the browser
		
		System.out.println(driver.getTitle()); // validates if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); // validates if you landed on correct url
		
		//System.out.println(driver.getPageSource()); // prints page source
		
		//driver.navigate().back();  //driver.navigate().forward();	
		//driver.close(); //closes current browser
		//driver.quit(); //closes all browsers opened by selenium script
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hi Facebook");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
