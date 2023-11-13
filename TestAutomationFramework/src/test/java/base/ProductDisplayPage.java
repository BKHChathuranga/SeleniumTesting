package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDisplayPage {

		WebDriver driver;
		
		By ShoeCard = By.xpath("//div[@id='ec_product_image_effect_4481370']//a[@class='ec_image_link_cover']");
		By ShoeAddCartButton = By.xpath("//a[@id='ec_add_to_cart_5']");
		By DenimCoatCard = By.xpath("//div[@id='ec_product_image_effect_4381370']//a[@class='ec_image_link_cover']");
		By ViewCartButton = By.xpath("//a[@title='View Cart']");
		
		public ProductDisplayPage(WebDriver d){
			driver = d;
		}
		
		public void clickShoeCard() {
			driver.findElement(ShoeCard).click();
		}
		public void clickShoeAddCartButton() {
			driver.findElement(ShoeAddCartButton).click();
		}
		public void clickDenimCoatCard() {
			driver.findElement(DenimCoatCard).click();
		}
		public void clickViewCart() {
			driver.findElement(ViewCartButton).click();
		}
}
