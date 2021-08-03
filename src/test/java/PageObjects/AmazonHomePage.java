package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class AmazonHomePage extends BaseClass {

	public AmazonHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;
	
	@FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;
	
	 public void searchAndClick(String arg1) {

	        WaitUntilElementVisible(searchBox);
	        searchBox.sendKeys(arg1);
	        searchButton.click();
	    }

}
