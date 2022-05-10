package StepDefs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingSteps extends baseClass{
	

	public BuyingSteps() throws InterruptedException, IOException {
		
		
	}
	
	
	
	@Given("user enter the webite URL")
	public void user_enter_the_webite_url() throws InterruptedException, IOException {
		browserInitialization();
		
		
	        
			
		
	   
	}

	@When("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
		Thread.sleep(10000);
		WebElement home_link =driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']//li//a[@href='index.html']"));
		home_link.click();
				
		WebElement product_header =driver.findElement(By.xpath("//a[contains(text(),'PRODUCT STORE')]"));
		if(product_header.isDisplayed()==true) {
			System.out.println("Navigated to homepage");
			
		}else {
			Assert.fail("USer not navigated to home page");
		}
			
			
//			
			System.out.println("Product Header , Recomended product is displayed ");
			
			
			WebElement Next_button =driver.findElement(By.xpath("//button[@id='next2']"));
			
			Next_button.click();
			
			Thread.sleep(4000);
			
			System.out.println("User is on next page");
			
			
			WebElement Prev_button =driver.findElement(By.xpath("//button[@id='prev2']"));
			
			Prev_button.isDisplayed();
			Prev_button.isEnabled();
			
			Prev_button.click();
			Thread.sleep(3000);
			System.out.println("User is navigated to the next page adn previous button is enabled");
			
			
	    
	      
	}

	@Then("user is displayed home page and its contents")
	public void user_is_displayed_home_page_and_its_contents() throws InterruptedException {
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='card h-100']"));      //Identify all the elements on web page
        
        int elementsCount = allElements.size();
        
        System.out.println("No. of recomended product present on the webpage = "+elementsCount);
        
        
        Thread.sleep(3000);
        System.out.print("User is navigated to the login page");
        Thread.sleep(5000);
	      
	}

	@And("scroll is enabled")
	public void scroll_is_enabled() {
		
		WebElement e = driver.findElement(By.xpath("(//div[@class='card h-100'])[5]"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", e);
	     
		
	      
	}

	@Then("user can navigate to different categories displayed")
	public void user_can_navigate_to_different_categories_displayed() {
	     
	      WebElement phone_cat = driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
	      phone_cat.click();
	      System.out.println("Phone Category displayed");
	      
	      
	}

	@And("view the list of products")
	public void view_the_list_of_products() {
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='card h-100']"));      //Identify all the elements on web page
        
        int elementsCount = allElements.size();
        
        System.out.println("No. of phones present on the webpage = "+elementsCount);
        
        
	      
	}

	@When("user is on category page")
	public void user_is_on_category_page() {
		
		System.out.println("User is on the Mobile Category page");
	}

	@Then("user clicks on product")
	public void user_clicks_on_product() {
		
		WebElement samsung_galaxy = driver.findElement(By.xpath("//div[@class='card h-100' ] //a[text()='Samsung galaxy s6']"));
		samsung_galaxy.click();
		System.out.println("User clicks on the product");
		
		
	     
	      
	}

	@And("view the product description")
	public void view_the_product_description() {
	     
		WebElement product_description = driver.findElement(By.xpath("//div[@id='more-information']//p"));
		product_description.isDisplayed();
		
		String expected_text_product_description = "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM."
				+ " The phone packs 32GB of internal storage cannot be expanded." ;
		String Actual_text_procuct_description = product_description.getText();
		
		if(expected_text_product_description.equals(Actual_text_procuct_description)) {
			System.out.println("Product description does not match")	;
			}else {
				Assert.fail();
			}
	      
	}

	@When("user is product description page")
	public void user_is_product_description_page() {
	     
	      
	}

	@And("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	     
	      
	}

	@Then("product is added to cart")
	public void product_is_added_to_cart() {
	     
	      
	}

	@When("user clicks on cart")
	public void user_clicks_on_cart() {
	     
	      
	}

	@Then("user is navigated to cart page")
	public void user_is_navigated_to_cart_page() {
	     
	      
	}

	@And("check delete funtionality of cart")
	public void check_delete_funtionality_of_cart() {
	     
	      
	}

	@When("user clicks place order")
	public void user_clicks_place_order() {
	     
	      
	}

	@Then("verify form is displayed and correct information is entered")
	public void verify_form_is_displayed_and_correct_information_is_entered() {
	     
	      
	}

	@When("user clicks on purchase")
	public void user_clicks_on_purchase() {
	     
	      
	}

	@Then("checkout confirmation is displayed with necessary details")
	public void checkout_confirmation_is_displayed_with_necessary_details() {
	     
	      
	}

}
