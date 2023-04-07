package Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swag_login {
	
	public swag_login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement USERNAME;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PASSWORD;
	
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement LOGIN;
	
	public void username() {
		USERNAME.sendKeys("standard_user");
	}
	
	public void password() {
		PASSWORD.sendKeys("secret_sauce");
	}
	
	public void Login() {
		LOGIN.click();
	}

}
