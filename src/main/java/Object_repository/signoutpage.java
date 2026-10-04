package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signoutpage {

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement howericon;

	public WebElement gethowericonElement() {

		return howericon;
	}

	@FindBy(xpath = "//a[@href='index.php?module=Users&action=Logout']")
	private WebElement logout;

	public WebElement getlogoutElement() {

		return logout;
	}

	public signoutpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
