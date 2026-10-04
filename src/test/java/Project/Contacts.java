package Project;

import java.io.FileInputStream;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import Object_repository.HomePage;
import Object_repository.Loginpage;
import Object_repository.creatingpage;
import Object_repository.signoutpage;
import generic_Utility.Java_Utility;
import generic_Utility.fileutility;

public class Contacts {

	public static void main(String[] args) throws Exception {

		// calling from java utility method //

		int randomnumber = Java_Utility.getrandomnumber();

		// Generic utility using from JSON Method //

		fileutility futil = new fileutility();

		String URL = futil.getdatafomjsonfile("url");
		String USERNAME = futil.getdatafomjsonfile("un");
		String PASSWORD = futil.getdatafomjsonfile("pwd");

		System.out.println("URL :" + URL);
		System.out.println("USERNAME :" + USERNAME);
		System.out.println("PASSWORD :" + PASSWORD);

		// generic utility using from Excel Method //

		String firstname = futil.getdatafromexcelfile("Contacts", 1, 0) + randomnumber;
		String Lastname = futil.getdatafromexcelfile("Contacts", 1, 1) + randomnumber;
		String Leadsource = futil.getdatafromexcelfile("Contacts", 1, 2);
		String email = futil.getdatafromexcelfile("Contacts", 1, 3);
		String Assistant = futil.getdatafromexcelfile("Contacts", 1, 4);

		System.out.println("firstname:" + firstname);
		System.out.println("Lastname:" + Lastname);
		System.out.println("Leadsource:" + Leadsource);
		System.out.println("email:" + email);
		System.out.println("Assistant:" + Assistant);

		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);

		Loginpage Lp = new Loginpage(driver);

		Lp.getusername().sendKeys("admin");
		Lp.getpassword().sendKeys("manager");
		Lp.getsubmmitbutton().click();

		HomePage Hp = new HomePage(driver);

		Hp.getContacts().click();
		Hp.getcreateContact().click();



		creatingpage cp = new creatingpage(driver);

		cp.getfirstnameElement().sendKeys(firstname);
		cp.getlastnameElement().sendKeys(Lastname);
		cp.getleadsourceElement().sendKeys(Leadsource);
		cp.getemailElement().sendKeys(email);
		cp.getassistantElement().sendKeys(Assistant);
		cp.getsaveElement().click();


		signoutpage sp = new signoutpage(driver);  
		
		Actions act = new Actions(driver);		
		
		act.moveToElement(sp.gethowericonElement()).perform();

		
        sp.getlogoutElement().click();
		
        driver.close();
	}
}