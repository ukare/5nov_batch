package swag_validation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Swag.swag_about;
import Swag.swag_addtocart;
import Swag.swag_checkout;
import Swag.swag_login;
import Swag.swag_logout;

public class validation {
	WebDriver driver;
	swag_login login;
	swag_logout out;
	swag_addtocart cart;
	swag_checkout outtt;
	swag_about about;
	
	@BeforeClass
	
	public void beforeclass() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	
	public void afterclass() {
		driver.close();
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		login = new swag_login(driver);
		
		login.username();
		login.password();
		login.Login();
	}
	
	@AfterMethod
	
	public void aftermethod() {
		out = new swag_logout(driver) ;
			
		out.Button();
		out.logout();
		
	}
	
	@Test
	
	public void test1() {
		
		cart = new swag_addtocart(driver);
		
		cart.addtocart1();
		cart.addtocart2();
		cart.addtocart3();
		cart.addtocart4();
	}
	
	@Test
	
	public void test2() {
		outtt = new swag_checkout(driver);
		
		outtt.bag();
		outtt.checkout();
		outtt.firstname();
		outtt.lastname();
		outtt.pincode();
		outtt.contin();
		outtt.finish();
	}
	
	@Test
	
	public void test3() {
		about = new swag_about(driver);
		
		about.list();
		about.aboutclick();
		about.enterpries();
		about.learnabout();
		about.contactus();
	}
	
	

}
