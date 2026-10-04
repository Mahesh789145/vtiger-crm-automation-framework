package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingpage {

	
   @FindBy(name = "firstname")
   
   private WebElement firstname;
  
   
  public WebElement getfirstnameElement(){
	  
	  return firstname;
	  
  }
	@FindBy(name = "lastname")
	
	private WebElement lastname;
	
	public WebElement getlastnameElement(){
		
		return lastname;
	
	}
  
     @FindBy(name ="leadsource")
  
      private  WebElement leadsource;
      
      public WebElement getleadsourceElement(){
    	  
    	  return leadsource;
    	  
      }
      
      
      @FindBy(id = "email")
      
      private WebElement email;
      
      public WebElement getemailElement(){
    	  
    	  return email;
      }
  
	
      
      @FindBy(id = "assistant")
      
      private WebElement assistant;
      
      
       public WebElement getassistantElement(){
    	   
    	   return assistant;    	   
       }
      
       
       
       @FindBy(xpath = "//input[@title='Save [Alt+S]']")

       
       private WebElement save;
       
       
       public WebElement getsaveElement(){
    	   
    	   
    	   return save;
       }
       
       
       public creatingpage(WebDriver driver){
    	   
    	   PageFactory.initElements(driver, this);
       }
       
       
       
}
