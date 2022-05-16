package StepDefs;


import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import Utilities.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingSteps extends baseClass{
	
	
	
	public BuyingSteps() throws InterruptedException, IOException {
		
		
	}
	
	public static String get_product_name ;
	
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
	public void user_clicks_on_product() throws Exception {
		Thread.sleep(5000);
		
		WebElement samsung_galaxy = driver.findElement(By.xpath("//div[@class='card h-100' ] //a[text()='Samsung galaxy s6']"));
		samsung_galaxy.click();
		System.out.println("User clicks on the product");
		
		
	     
	      
	}

	@And("view the product description")
	public void view_the_product_description() throws Exception {
		
		Thread.sleep(5000);
	     
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
		
		WebElement product_name = driver.findElement(By.xpath("//h2[text()= 'Samsung galaxy s6']"));
		
		get_product_name = product_name.getText(); 
	      
	}

	@When("user is product description page")
	public void user_is_product_description_page() throws InterruptedException {
	     
		Thread.sleep(5000);
	}

	@And("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() throws Exception {
		Thread.sleep(6000);
		WebElement Add_to_cart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		Add_to_cart.isDisplayed();
		Add_to_cart.isEnabled();
		Add_to_cart.click();
		
		System.out.println("User clicked on Add to Cart option");
		
		
		
	     
	      
	}

	@Then("product is added to cart")
	public void product_is_added_to_cart() throws Exception {
		System.out.println("Verify Pop up : Produc is added to cart");
		Thread.sleep(5000);
		
		
		
		String alert_confirmation = driver.switchTo().alert().getText();
		
		System.out.println(alert_confirmation);
		
		Alert simple_alert = driver.switchTo().alert();
		simple_alert.accept();
		
		Thread.sleep(5000);
		
	     
	      
	}

	@When("user clicks on cart")
	public void user_clicks_on_cart() throws InterruptedException {
		Thread.sleep(5000);
		WebElement cart_link = driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']//li//a[text()='Cart']"));
		cart_link.click();
		
		
		
	     
	      
	}

	@Then("user is navigated to cart page")
	public void user_is_navigated_to_cart_page() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("User is navigated to cart Page");
		WebElement product_header = driver.findElement(By.xpath("//h2[text()= 'Products']"));
		product_header.isDisplayed();
		Thread.sleep(5000);
		
		WebElement product_name = driver.findElement(By.xpath("//tbody[@id='tbodyid']//tr//td[text()='"+get_product_name+"']"));
		
		String product_name_str = product_name.getText();
		String product = product_name_str.trim(); 
		if (product.equals(get_product_name)) {
			
			System.out.println(product_name.getText());
//			Assert.assertSame("Selected Product Vaidated", product, get_product_name);
			System.out.println("product Validated");
			
			
		}else {
			Assert.fail("Selected Product is not same ");
			
		}
		
	     
	      
	}

	@And("check delete funtionality of cart")
	public void check_delete_funtionality_of_cart() throws Exception {
		
		Thread.sleep(5000);
	     
		System.out.println("Add Another product to check delete Functionality");
		WebElement home_link =driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']//li//a[@href='index.html']"));
		home_link.click();
		Thread.sleep(5000);
		
		WebElement Sony_vaio_i5 = driver.findElement(By.xpath("//a[text()='Sony vaio i5']"));
		String get_product_delete_name = Sony_vaio_i5.getText();
		Sony_vaio_i5.click();
		Thread.sleep(5000);
		
		WebElement Add_to_cart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		Add_to_cart.click();
		Thread.sleep(3000);
		Alert simple_alert = driver.switchTo().alert();
		simple_alert.accept();
		
		WebElement cart_link = driver.findElement(By.xpath("//ul[@class='navbar-nav ml-auto']//li//a[text()='Cart']"));
		cart_link.click();
		Thread.sleep(4000);
		WebElement vaio_price = driver.findElement(By.xpath("(//tr[@class='success']//td/following-sibling::td/following-sibling::td)[1]"));
		String vaio_price_str = vaio_price.getText();
		int i=Integer.parseInt(vaio_price_str);
		
		
		
		WebElement total= driver.findElement(By.xpath("//h3[@id='totalp']"));
		String total_price = total.getText();
		int i2 = Integer.parseInt(total_price);
		
		
		System.out.println("Total Before deleting product = "+ total_price);
		
		Thread.sleep(5000);
		
		WebElement delete_vaio = driver.findElement(By.xpath("//a[text()='Delete']/../..//td[text()='"+get_product_delete_name+"']"));
		delete_vaio.isDisplayed();
		
		delete_vaio.click();
		
		
		System.out.println("Total price after deleting = "+ (i2-i));		
		
	      
	}

	@When("user clicks place order")
	public void user_clicks_place_order() throws Exception {
		Thread.sleep(5000);
		
	     WebElement place_order = driver.findElement(By.xpath("//button[text()='Place Order']"));
	     Assert.assertTrue(place_order.isDisplayed());
	     
	     place_order.click();
	     
	     System.out.println("User navigated to Customer details page");
	     
	     Thread.sleep(5000);
	     
	     WebElement Place_order_form = driver.findElement(By.xpath("//div[@class='modal-header']//h5[text()='Place order']"));
	     Place_order_form.isDisplayed();
	     
	     WebElement total_in_form = driver.findElement(By.xpath("//form//label[@id='totalm']"));
	     
	     System.out.println("Total ammount displayed in form = "+total_in_form);
	     
	     
	     
	     
	     
	      
	}

	@Then("verify form is displayed and correct information is entered")
	public void verify_form_is_displayed_and_correct_information_is_entered() throws Exception {
		Thread.sleep(5000);
		
		  WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		  WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
		  WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		  WebElement Cc = driver.findElement(By.xpath("//input[@id='card']"));
		  WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
		  WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
		  
		  name.sendKeys("Test User");
		  Thread.sleep(2000);
		  country.sendKeys("Test Country");
		  Thread.sleep(2000);
		  city.sendKeys("Test City");
		  Thread.sleep(2000);
		  Cc.sendKeys("7896541232546890");
		  Thread.sleep(2000);
		  month.sendKeys("May");
		  Thread.sleep(2000);
		  year.sendKeys("2023");
		  Thread.sleep(2000);
		  
		  
		  
	     
	      
	}

	@When("user clicks on purchase")
	public void user_clicks_on_purchase() throws InterruptedException {
		
		Thread.sleep(5000);
		
	     WebElement puRCHASE = driver.findElement(By.xpath("//button[text()='Purchase']"));
	     puRCHASE.click();
	     
	      
	}

	@Then("checkout confirmation is displayed with necessary details")
	public void checkout_confirmation_is_displayed_with_necessary_details() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement popup_confirmation = driver.findElement(By.xpath("//div[@class='sweet-alert  showSweetAlert visible']"));
		popup_confirmation.isDisplayed();
		
		WebElement ok_button = driver.findElement(By.xpath("//button[text()='OK']"));
		ok_button.click();
	      
		System.out.println("user is navigated to homepage");
		
		tear_down();
	}

}
