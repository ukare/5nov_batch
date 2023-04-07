package Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swag_addtocart {
	
	public swag_addtocart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement cart1;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[2]")
	private WebElement cart2;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[3]")
	private WebElement cart3;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[4]")
	private WebElement cart4;
	
	
	
	public void addtocart1() {
		cart1.click();
	}
	
	public void addtocart2() {
		cart2.click();
	}
	
	public void addtocart3() {
		cart3.click();
	}
	
	public void addtocart4() {
		cart4.click();
	}
	
	
	
	

}
