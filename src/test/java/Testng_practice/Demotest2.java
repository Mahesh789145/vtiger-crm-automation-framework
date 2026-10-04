package Testng_practice;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demotest2 {

	WebDriver driver = null;

	@Test(enabled =false)
	public void logintofb() {

		driver = new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("login in Facebookpage");
		driver.get("https://www.facebook.com/");
		driver.quit();

	}

	@Test(invocationCount = 10)
	public void logintoinsta() {

		driver = new ChromeDriver();
		Assert.assertTrue(true);
		System.out.println("login in Instagrampage");
		driver.get("https://www.instagram.com");
		driver.quit();

	}

}
