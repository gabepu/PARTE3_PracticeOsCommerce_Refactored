package Processes;

import org.openqa.selenium.WebDriver;

public class Purchase {
	
	WebDriver driver;
	
    public Purchase(WebDriver driver){
        this.driver = driver;
    }
    
	public void purchase(String paymentMethodInputValue) {
		Screens.PurchasePage purchase = new Screens.PurchasePage(driver);
		purchase.purchase(paymentMethodInputValue);
	}
}
