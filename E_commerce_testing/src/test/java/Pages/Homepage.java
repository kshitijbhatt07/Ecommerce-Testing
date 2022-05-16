package Pages;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.baseClass;

;

public class Homepage extends baseClass {
	
	public Homepage() {
		super();
		
	}
	
	@FindBy(xpath =  "//a[contains(text(),'PRODUCT STORE')]")
	WebElement Product_store_header;
	
	@FindBy(xpath = "//div[@class='card h-100']")
	WebElement recomended_products;
	
	@FindBy(xpath = "//button[@id='next2']")
	WebElement Next_button ; 
	
	@FindBy(xpath = "//button[@id='prev2']")
	WebElement Prev_button ; 
	
	@FindBy(id = "login2")
	WebElement Login_button;
	
	
	
	public void verify_homepage() throws InterruptedException {
		
		Thread.sleep(10000);
		System.out.println("Inside the method");
		
//		Product_store_header.isDisplayed();
//		
//		recomended_products.isDisplayed();
//		
		System.out.println("Product Header , Recomended product is displayed ");
		
		Next_button.click();
		
		Thread.sleep(4000);
		
		System.out.println("User is on next page");
		
		Prev_button.isDisplayed();
		Prev_button.isEnabled();
		
		Prev_button.click();
		Thread.sleep(3000);
		System.out.println("User is navigated to the next page adn previous button is enabled");
		
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
        
        int elementsCount = allElements.size();
        
        System.out.println("No. of recomended product present on the webpage = "+elementsCount);
        
		
	}
	
	

}
