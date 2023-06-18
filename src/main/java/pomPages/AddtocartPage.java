package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	@FindBy(id="add")
	
	private WebElement Add;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	
	private WebElement addtocart;
	
	public AddtocartPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return Add;
	}
	
	public void addtocartbutton() {
	
		addtocart.click();
		
	}
}
