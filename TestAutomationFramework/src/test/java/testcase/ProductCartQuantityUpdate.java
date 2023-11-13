package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import base.ProductDisplayPage;

public class ProductCartQuantityUpdate extends BaseTest {
	@Test
	public static void AddToCart() throws InterruptedException {
		ProductDisplayPage productDisplayPage = new ProductDisplayPage(driver);

		SoftAssert softAssert = new SoftAssert();

		String expectedQuantity = "3";
		//Add show to the cart
		productDisplayPage.clickShoeAddCartButton();
		
		//Wait until the view cart option showing on the product page
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("viewCartButton")))).click();
		
		//Click on the quantity increase button twice 
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("cartQuantityIncreaseButton")))).click();
		driver.findElement(By.xpath(loc.getProperty("cartQuantityIncreaseButton"))).click();
		
		//Then click on the update button
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("cartUpdateButton")))).click();
		wait3.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(loc.getProperty("quantityValue")), "2"));
		
		//Reading the current quantity of the product
		String actualQuantity = driver.findElement(By.xpath(loc.getProperty("quantityValue"))).getAttribute("value");
		
		//Assertion
		System.out.println("Verifying cart quantity update");
		softAssert.assertEquals(actualQuantity, expectedQuantity, "Quantity verification failed");
		softAssert.assertAll();
	}
}
