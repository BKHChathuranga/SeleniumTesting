package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	
	By ShoeIncreaseButton = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/section[1]/div[3]/table[1]/tbody[1]/tr[3]/td[5]/table[1]/tbody[1]/tr[1]/td[3]/input[1]");
	By ShoeUpdate = By.xpath("//div[contains(@id, 'ec_cartitem_update_') and contains(@onclick, 'ec_cartitem_update') and text()='UPDATE']");
	By CurrencyDropdown = By.id("ec_currency_conversion");
	By PriceFilter = By.xpath("//a[normalize-space()='$25.00 - $49.99 (2)']");
	
	public CartPage(WebDriver d){
		driver = d;
	}
	
	public void clickShoeIncreaseButton() {
		driver.findElement(ShoeIncreaseButton).click();
	}
	public void clickShoeUpdate() {
		driver.findElement(ShoeUpdate).click();
	}
	public void clickCurrencyDropdown() {
		driver.findElement(CurrencyDropdown).click();
	}

	public String getQuantityInputValue() {
		WebElement quantityInput = driver.findElement(By.xpath("//input[contains(@class, 'ec_quantity')]"));
	    return quantityInput.getAttribute("value");
	}
}
