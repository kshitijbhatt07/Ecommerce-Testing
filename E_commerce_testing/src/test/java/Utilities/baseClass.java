package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.DesiredCapabilities;






public class baseClass {
	
	public static Properties pro;
	
	public static WebDriver driver;
	
	public baseClass() {
		try {
			pro = new Properties();
			FileInputStream ip = (new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Utilities\\config.properties"));
			pro.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void tear_down() {
		
		driver.quit();
	}
	

	public void browserInitialization() throws InterruptedException, IOException {

		String browserName = pro.getProperty("browser");
		System.out.println(browserName);

		if (browserName != "") {

			switch (browserName.toLowerCase()) {

			case "chrome": {

				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver_101.exe");

				DesiredCapabilities capability = new DesiredCapabilities();

				

				capability.setCapability("ignoreZoomSetting", true);

				driver = new ChromeDriver();

			}

				}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(pro.getProperty("URL"));
		}
		
		
		
		
	 else {

		org.junit.Assert.fail("Browser name is not valid");

	}
		
		
		
		
		}
	
	
	}
