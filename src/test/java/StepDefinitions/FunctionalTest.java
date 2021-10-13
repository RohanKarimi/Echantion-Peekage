package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
public class FunctionalTest {

	WebDriver driver = null;
	String BaseURL = "https://www.digikala.com";
	String CategoryMobileURL = "https://www.digikala.com/search/category-mobile/";


	@Before(value="@smoke", order=1)
	public void browserSetup() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		//setProperty for Windows
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		//setProperty for MAC
		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriverMAC");

		//setProperty for linux
		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriverLinux");

		driver = new ChromeDriver();

		driver.get(BaseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}



	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}


	
	
	

	@Given("The browser launched and opened")
	public void the_browser_launched_and_opened() {
		System.out.println("*** The browser launched and opened ***");
	}

	@And("The user see the list of products")
	public void the_user_see_the_list_of_products() {
	
		driver.navigate().to(CategoryMobileURL);
		System.out.println("*** products are displayed ***");
	}

	
	
	@When("The user click on the sort by price button")
	public void the_user_click_on_the_sort_by_price_button() throws InterruptedException, IOException {
		
		WebElement HighToLow = driver.findElement(By.xpath("//a[contains(text(),'گران‌ترین')]"));
		String FilterText = driver.findElement(By.xpath("//a[contains(text(),'گران‌ترین')]")).getText();
		System.out.println("The filter is HighToLow : "+ FilterText);
		HighToLow.click();
		
		Thread.sleep(6000);
			
		  // print the product details
	    java.util.List<WebElement> products = driver.findElements(By.className("c-price__value-wrapper"));
	    for(WebElement product:products) {
	        System.out.println(product.getText());      
	    } 
				
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir")+"/ScreenShotOfResult/High to low screen.png"));
		}
		

	@And("System display the products sorted")
	public void system_display_the_products_sorted() throws InterruptedException, IOException {     
		
		driver.findElement(By.xpath("//body/footer[1]/div[1]/div[1]/span[1]/span[1]")).click();
		Thread.sleep(2000);
			
		WebElement LowToHigh = driver.findElement(By.xpath("//a[contains(text(),'ارزان‌ترین')]"));
		String FilterText2 = driver.findElement(By.xpath("//a[contains(text(),'ارزان‌ترین')]")).getText();
		System.out.println("The filter is LowToHigh : "+ FilterText2);
		LowToHigh.click();
		
		Thread.sleep(6000);
	
		  // print the product details
	    java.util.List<WebElement> products = driver.findElements(By.className("c-price"));
	    for(WebElement product:products) {
	        System.out.println(product.getText());       
	    } 
		
		Screenshot screenshot2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot2.getImage(), "PNG", new File(System.getProperty("user.dir")+"/ScreenShotOfResult/low to High screen.png"));	
	}
	
	

		@Then("I Check the outcomes")
		public void i_check_the_outcomes() {
			
//			String expectedTitle= "c-price";
//			String actualTitle= driver.findElement(By.className("c-price")).getText();
//			Assert.assertEquals(expectedTitle,actualTitle,"xxxxxxx- Failed: The class not found -xxxxxxx");
	       // System.out.println(actualTitle);      


		}	


	}
