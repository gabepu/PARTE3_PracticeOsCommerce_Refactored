package Processes;

import org.openqa.selenium.WebDriver;

public class SelectProduct {

	WebDriver driver;
	
    public SelectProduct(WebDriver driver){
        this.driver = driver;
    }
    
    public void selectProduct(String product, String quantity) { 	
    	Screens.SelectPage selectProduct = new Screens.SelectPage(driver);
    	selectProduct.selectProduct(product, quantity);
    }
    
}
