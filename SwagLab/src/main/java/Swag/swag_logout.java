package Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swag_logout {
	
	public swag_logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement button;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement Logout;
	
	public void Button() {
		button.click();
	}
	
	public void logout() {
		Logout.click();
		System.out.println("hii");  // done by me
		
		System.out.println("chaitali pagal");
		System.out.println("baitad");
	}

}
