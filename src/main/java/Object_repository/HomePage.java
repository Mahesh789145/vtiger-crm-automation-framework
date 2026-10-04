package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath = "(//a[text()='Contacts'])[1]")
	 
	private WebElement Contacts;
	
	public WebElement getContacts(){
	
	 return Contacts; 
	
	}
	
	
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
		
		private WebElement createContact;
	
	          
	 public WebElement getcreateContact(){
		 
		 return createContact;
	 }	
	
		
	 public  HomePage(WebDriver driver){
		 
		 PageFactory.initElements(driver, this );
		 
		 
	 }
}
