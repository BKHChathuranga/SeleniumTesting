package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import base.ProductDetailsPage;
import dev.failsafe.internal.util.Assert;

public class PinkGreenColorQuantityIncrease  extends BaseTest{
	@Test
	public static void changeQuantityWithGreenAndPink () throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("denimCoat")))).click();
		productDetails.clickPink();
		productDetails.clickAddButton();
		boolean addToCartButtonAvailable = driver.findElements(By.xpath(loc.getProperty("productAddToCartButton"))).size() > 0;
		softAssert.assertTrue(addToCartButtonAvailable, "Add to Cart button is not available");
		productDetails.clickAddToCartButton();
		softAssert.assertAll();
		Thread.sleep(4000); 
	}

}
