import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizesalesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alekhya\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //class name = Chrome Driver
		
		driver.get("https://login.salesforce.com");
		
		//XPath //tagname[@attribute='value'] or //*[@attribute='value']
		
		//CSS tagname[attribute='value']  or [attribute='value'] 
		// CSS - tagname#idvalue  or #idvalue
		//CSS tagname.classvalue or .classvalue
		
		driver.findElement(By.cssSelector("#username")).sendKeys("this is my xpath");
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("hello");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
	
	}

}
