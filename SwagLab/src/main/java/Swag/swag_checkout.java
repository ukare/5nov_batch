package Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swag_checkout {

	public swag_checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement BAG;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement CHECKOUT;

	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement PinCode;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement CONTINOUE;
	
	@FindBy(xpath = "//button[@name='finish']")
	private WebElement FINISH;
	
	public void bag() {
		BAG.click();
	}
	
	public void checkout() {
		CHECKOUT.click();
	}

	public void firstname () {
		FirstName.sendKeys("abhijit");;
	}

	public void lastname () {
		LastName.sendKeys("oberio");;
	}

	public void  pincode () {
		PinCode.sendKeys("440027");
	}

	public void contin () {
		CONTINOUE.click();
	}
	
	public void finish() {
	   FINISH.click();
	}

}
