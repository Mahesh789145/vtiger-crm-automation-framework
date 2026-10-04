package dp_Extra;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "getdata")
	
	public void login(String un, String pwd) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys(un);

		driver.findElement(By.id("password")).sendKeys(pwd);

		driver.findElement(By.id("login-button")).click();

		

		boolean status = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(status);
		
		Thread.sleep(1000);
		driver.quit();

	}
	
	@DataProvider
	
	public Object[][] getdata(){
		
		Object[][] logindata = new Object[6][2];
		
		logindata[0][0] = "standard_user";
		logindata[0][1] = "secret_sauce";

		logindata[1][0] = "locked_out_user";
		logindata[1][1] = "secret_sauce";

		logindata[2][0] = "problem_user";
		logindata[2][1] = "secret_sauce";

		logindata[3][0] = "performance_glitch_user";
		logindata[3][1] = "secret_sauce";

		logindata[4][0] = "error_user";
		logindata[4][1] = "secret_sauce";

		logindata[5][0] = "visual_user";
		logindata[5][1] = "secret_sauce";
		
		return logindata;

		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
