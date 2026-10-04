package generic_Utility;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Webdriver_utility {
	
	
	  WebDriver  driver;
	  
	  public Webdriver_utility(WebDriver driver){
		  
		   this.driver = driver;
		  
		  
	  }
	
	
	

	public void switchtowindowhandleByTitle( String partialtitle) {

		Set<String> allwindows = driver.getWindowHandles();
		for (String Window : allwindows) {
			driver.switchTo().window(Window);
			if (driver.getTitle().contains(partialtitle)) {

				break;
			}

		}
	}

	public void switchtowindowhandleByURL( String partialURL) {

		Set<String> allwindows = driver.getWindowHandles();
		for (String Window : allwindows) {
			driver.switchTo().window(Window);
			if (driver.getTitle().contains(partialURL)) {

				break;
			}

		}
	}


     public void switchtoparentwindow(String pid){
    	   
    	     driver.switchTo().window(pid);
    	 
     }










}
