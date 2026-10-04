	package Object_repository;
	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
	public class Loginpage {
	
		@FindBy(name = "user_name")
		private WebElement un;
	
		public WebElement getusername(){
			return un;
		
		}	
		
		@FindBy(name = "user_password")
		private WebElement pwd;
		
		public WebElement getpassword(){
			
			return pwd;
		}
		
		
		@FindBy(id ="submitButton")
		
		private WebElement sb;
		
		public WebElement getsubmmitbutton(){
			
			return sb;
			
		}
		
		
		public Loginpage(WebDriver driver){
			
			PageFactory.initElements(driver, this);
		}
	
	}
	
	
	
	
	
