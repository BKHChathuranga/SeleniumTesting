package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import base.ProductDetailsPage;
import base.ProductDisplayPage;

public class ProductDetailsPageTest extends BaseTest{
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

	
	@Test
	public static void addCommentUnderProduct() {
		ProductDisplayPage productDisplayPage = new ProductDisplayPage(driver);
		ProductDetailsPage productDetails = new ProductDetailsPage(driver);
		
		productDisplayPage.clickShoeCard();
		productDetails.setComment();
		productDetails.setUser();
		productDetails.setEmail();
		productDetails.setUrl();
		productDetails.clickCommentButton();
	}
	
	
	@Test
	public static void ApplyPriceFilter() {
		driver.findElement(By.xpath(loc.getProperty("shoeCard"))).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("priceFilter")))).click();
	}
	

	
}
