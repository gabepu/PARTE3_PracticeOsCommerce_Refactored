package Screens;

import org.openqa.selenium.WebDriver;

public class PurchasePage {

	WebDriver driver;
		
    public PurchasePage(WebDriver driver){
        this.driver = driver;
    }

	public void purchase(String paymentMethodInputValue) {
		Processes.PurchaseProcess purchaseProcess = new Processes.PurchaseProcess(driver);
		purchaseProcess.purchase(paymentMethodInputValue);	
	}
	
}
