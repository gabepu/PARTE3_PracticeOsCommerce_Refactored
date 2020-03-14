package processes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertResult {

	WebDriver driver;
	
    public AssertResult(WebDriver driver){
        this.driver = driver;
    }
    
	public void assertResult(String result) {
		screens.ResultPage assertResult = new screens.ResultPage(driver);
		assertResult.assertResult(result);	
	}
}
