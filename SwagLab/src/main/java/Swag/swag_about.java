package Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swag_about {
	
	public swag_about(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement List;
	
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	private WebElement AboutClick;
	
	@FindBy(xpath = "(//a[@href='/enterprise'])[1]")
	private WebElement EnterPrise;
	
	@FindBy(xpath = "(//button[@tabindex='0'])[9]")
	private WebElement LearnAbout;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	private WebElement ContactUs;
	
	public void list() {
		List.click();
	}
	
	public void aboutclick() {
		AboutClick.click();
	}
	public void enterpries() {
		EnterPrise.click();
	}
	public void learnabout() {
		LearnAbout.click();
	}
	public void contactus() {
		ContactUs.click();
	}
}
