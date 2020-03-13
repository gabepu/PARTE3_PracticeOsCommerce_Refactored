package Processes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseProcess {
	
	WebDriver driver;
	
    public PurchaseProcess(WebDriver driver){
        this.driver = driver;
    }
    
	public void purchase(String paymentMethodInputValue) {
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.cssSelector(paymentMethodInputValue)).click();
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.id("tdb5")).click();		
	}
}
