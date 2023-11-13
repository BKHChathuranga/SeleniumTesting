package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class PriceFilter extends BaseTest{
	@Test
	public static void ApplyPriceFilter() {
		driver.findElement(By.xpath(loc.getProperty("shoeCard"))).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("priceFilter")))).click();
	}
}
