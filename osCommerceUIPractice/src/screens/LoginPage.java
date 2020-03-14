package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
		
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

	public void login(String username, String password) {
		driver.get("https://demo.oscommerce.com/login.php");
		driver.findElement(By.name("email_address")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}

}
