import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizefb {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alekhya\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //class name = Chrome Driver
		
		driver.get("https://www.facebook.com");
		
		//XPath //tagname[@attribute='value'] //*[@attribute='value'] 
		//XPath //tagname[contains(@attribute,'value')]  for Regular expression
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("this is my xpath");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("hello");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//CSS tagname[attribute='value']  or [attribute='value']
		// CSS - tagname#idvalue  or #idvalue
		//CSS tagname.classvalue or .classvalue
		//CSS tagname[attribute*='value'] for Regular expression
		
		//driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("this is my css");
		//driver.findElement(By.cssSelector("[type='password']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
