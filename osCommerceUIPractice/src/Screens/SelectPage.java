package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPage {
	
	WebDriver driver;
	
    public SelectPage(WebDriver driver){
        this.driver = driver;
    }
	
    public void selectProduct(String product, String quantity) { 		
    	driver.findElement(By.linkText(product)).click();
    	driver.findElement(By.id("tdb5")).click();
		WebElement inputString = driver.findElement(By.name("cart_quantity[]"));
		inputString.clear();
		inputString.sendKeys(quantity);	
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.id("tdb6")).click();	
    }
    
}
