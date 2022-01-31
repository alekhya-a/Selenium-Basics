import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alekhya\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		//XPath //tagname[contains(@attribute,'value')]  for Regular expression
		
		//CSS tagname[attribute='value']  or [attribute='value']
		// CSS - tagname#idvalue  or #idvalue
		//CSS tagname.classvalue or .classvalue
		//CSS tagname[attribute*='value'] for Regular expression
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("mypass");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
