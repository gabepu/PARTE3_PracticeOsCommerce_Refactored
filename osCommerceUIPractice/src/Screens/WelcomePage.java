package Screens;

import org.openqa.selenium.WebDriver;

public class WelcomePage {

	WebDriver driver;
		
    public WelcomePage(WebDriver driver){
        this.driver = driver;
    }
	
	public void selectProduct(String product, String quantity) {
		Processes.SelectProductProcess selectProductProcess = new Processes.SelectProductProcess(driver);
		selectProductProcess.selectProduct(product, quantity);
		selectProductProcess.selectQuantity(quantity);
	}
    
}
