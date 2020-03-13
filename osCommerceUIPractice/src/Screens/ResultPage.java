package Screens;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

	private By levelTitle=By.cssSelector("h1");
	
	WebDriver driver;
	
    public ResultPage(WebDriver driver){
        this.driver = driver;
    }
	
    public void assertResult(String result) {
		WebElement levelTitleElement=driver.findElement(levelTitle);
		assertEquals(levelTitleElement.getText(),result);
    }
}
