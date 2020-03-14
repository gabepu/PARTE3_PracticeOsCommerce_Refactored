package processes;

import org.openqa.selenium.WebDriver;

public class SelectProduct {

	WebDriver driver;
	
    public SelectProduct(WebDriver driver){
        this.driver = driver;
    }
    
    public void selectProduct(String product, String quantity) { 	
    	screens.SelectPage selectProduct = new screens.SelectPage(driver);
    	selectProduct.selectProduct(product, quantity);
    }
    
}
