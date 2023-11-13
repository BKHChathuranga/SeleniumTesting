package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;
import base.ProductDisplayPage;

public class CurrencyChange extends BaseTest {

	@Test
	public static void changeCurrencyType () throws InterruptedException{
		ProductDisplayPage productDisplayPage = new ProductDisplayPage(driver);
		productDisplayPage.clickShoeCard();
		WebElement dropDown = driver.findElement(By.id(loc.getProperty("dropDown")));
		Select select = new Select(dropDown);
		select.selectByValue("EUR");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.id(loc.getProperty("dropDown")))).click();
		Thread.sleep(4000); 
		}
}
