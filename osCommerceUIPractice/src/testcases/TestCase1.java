package testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


class TestCase1{

	private static WebDriver driver;
	private static ChromeDriverService service;

	// For test1() step #10
	private By levelTitle=By.cssSelector("h1");
	
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
		      .usingDriverExecutable(new File("chromedriver.exe"))
		      .usingAnyFreePort()
		      .build();
		  service.start();
	
	}
	
	public static void createDriver() {
		  driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());	  
	}
	
	public static void quitDriver() {
		  driver.quit();
	}

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		  createAndStartService();	
	}

	@AfterAll
	static void tearDownAfterClass() {
		// Do nothing on purpose.
	}

	@BeforeEach
	void setUp() throws Exception {
		createDriver();
		driver.manage().window().maximize();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		quitDriver();
	}

	@Test
	void test1() {
		
		// 1. Go to demo.oscommerce.com
		driver.get("https://demo.oscommerce.com");
		
		// 2. Click "Samsung Galaxy Tab" product
		driver.findElement(By.linkText("Samsung Galaxy Tab")).click();
		
		// 3. Add to Cart
		driver.findElement(By.id("tdb4")).click();
		
		// 4. Update quantity to 2
		WebElement inputString = driver.findElement(By.name("cart_quantity[]"));
		inputString.clear();
		inputString.sendKeys("2");

		// 5. Assert that quantity is 2
		driver.findElement(By.id("tdb4")).click();

		// 6. Click checkout button
		driver.findElement(By.id("tdb5")).click();
		
		// 7. Sign in
		driver.findElement(By.name("email_address")).sendKeys("testing65536@testingmail.com");
		driver.findElement(By.name("password")).sendKeys("T3sting.G00d!");
		driver.findElement(By.id("tdb1")).click();
			
		// 8. Select "Cash on delivery" payment method
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.cssSelector("input[value='cod'")).click();
		driver.findElement(By.id("tdb6")).click();

		// 9. Click "Pay now"
		driver.findElement(By.id("tdb5")).click();
		
		// 10. Check that the message "Your order has been processed" is shown
		WebElement levelTitleElement=driver.findElement(levelTitle);
		assertEquals(levelTitleElement.getText(),"Your Order Has Been Processed!");
		
		// Logout
		driver.get("https://demo.oscommerce.com/logoff.php");
	}

	
	@Test
	void test2() {
		processes.Login login = new processes.Login(driver);
		processes.SelectProduct selectProduct = new processes.SelectProduct(driver);
		processes.Purchase purchase = new processes.Purchase(driver);
		processes.AssertResult assertResult= new processes.AssertResult(driver);
		processes.Logout logout = new processes.Logout(driver);
		
		login.login("testing65536@testingmail.com", "T3sting.G00d!");
		selectProduct.selectProduct("Beloved", "3");
		purchase.purchase("input[value='cod'");
		assertResult.assertResult ("Your Order Has Been Processed!");		
		logout.logout();
	}

}



