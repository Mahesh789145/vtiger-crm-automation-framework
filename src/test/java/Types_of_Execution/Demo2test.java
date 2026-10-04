package Types_of_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2test {

	@Test(groups="smoke")
	public void case2() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(groups="smoke")
	public void case22() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(groups="regression")
	public void case222() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();

	}
}
