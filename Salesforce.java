import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alekhya\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //class name = Chrome Driver
		
		// X driver = new X();
		
		driver.get("https://login.salesforce.com"); 
		
		//driver.findElement(By.id("username")).sendKeys("Hi Salesforce");
		driver.findElement(By.cssSelector("#username")).sendKeys("Welcome");
		driver.findElement(By.name("pw")).sendKeys("123456");	
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); 
		System.out.println(driver.findElement(By.cssSelector("div#error")).getText());
		//In java " ' ' " only accepted. " " " " gives syntax error
		//driver.findElement(By.className("button r4 wide primary")).click(); //Error: Compound classes
				
		
	}

}
