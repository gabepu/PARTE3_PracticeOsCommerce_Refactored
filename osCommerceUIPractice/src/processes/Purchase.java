package processes;

import org.openqa.selenium.WebDriver;

public class Purchase {
	
	WebDriver driver;
	
    public Purchase(WebDriver driver){
        this.driver = driver;
    }
    
	public void purchase(String paymentMethodInputValue) {
		screens.PurchasePage purchase = new screens.PurchasePage(driver);
		purchase.purchase(paymentMethodInputValue);
	}
}
