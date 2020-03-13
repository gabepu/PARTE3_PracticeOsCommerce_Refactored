package Processes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginProcess {

	WebDriver driver;
		
    public LoginProcess(WebDriver driver){
        this.driver = driver;
    }
    
    public void login(String username, String password) {
		driver.findElement(By.name("email_address")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
    }
    
}
