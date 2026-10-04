package Base_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Object_repository.Loginpage;
import generic_Utility.fileutility;

public class Demo {
    public static WebDriver driver;

    @BeforeClass
    public void openBrowser() throws Exception {
        fileutility futil = new fileutility();
        String URL = futil.getdatafomjsonfile("url");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @BeforeMethod
    public void login() throws Exception {
        fileutility futil = new fileutility();
        String USERNAME = futil.getdatafomjsonfile("un");
        String PASSWORD = futil.getdatafomjsonfile("pwd");

        Loginpage Lp = new Loginpage(driver);
        Lp.getusername().sendKeys(USERNAME);
        Lp.getpassword().sendKeys(PASSWORD);
        Lp.getsubmmitbutton().click();
    }
    
    
    @AfterMethod
    
    public void logout() {
		System.out.println("logout");
	}


    @AfterClass
    public void closeBrowser() { 
    	
    	driver.quit(); 
    	
    }
}