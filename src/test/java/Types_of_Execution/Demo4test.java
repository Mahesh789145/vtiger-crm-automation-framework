package Types_of_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo4test {

  @Parameters("bro")	
	@Test
	public void Case1(String browser) throws InterruptedException{
		
		
		WebDriver driver = null;
		
		
		if(browser.equals("chrome")){
			driver =  new ChromeDriver();
			System.out.println("Browser is openned");
		}else if(browser.equals("edge")){
			driver =  new EdgeDriver();
			System.out.println("edge is openned");
			
		}else if (browser.equals("firefox")){
			driver =  new FirefoxDriver();
			System.out.println("firefox is openned");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	
	
	
	
}
