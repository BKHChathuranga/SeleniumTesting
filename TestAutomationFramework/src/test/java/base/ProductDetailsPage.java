package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
	WebDriver driver;
	
	By comment = By.xpath("//textarea[@id='comment']");
	By user = By.xpath("//input[@id='author']");
	By email = By.xpath("//input[@id='email']");
	By url = By.xpath("//input[@id='url']");
	By commentButton = By.xpath("//button[@id='academy-comment-submit']");
	By pink = By.xpath("//img[@title='Pink']");
	By addButton = By.xpath("//input[@value='+']");
	By addToCartButton = By.xpath("//input[@value='ADD TO CART']");
	
	public ProductDetailsPage(WebDriver d){
		driver = d;
	}
	
	public void clickCommentButton() {
		driver.findElement(commentButton).click();
	}
	public void setComment() {
		driver.findElement(comment).sendKeys("Test Comment");
	}
	public void setUser() {
		driver.findElement(user).sendKeys("user");
	}
	public void setEmail() {
		driver.findElement(email).sendKeys("user@gmail.com");
	}
	public void setUrl() {
		driver.findElement(url).sendKeys("www.test.com");
	}
	public void clickAddButton() {
		driver.findElement(addButton).click();
	}
	public void clickAddToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	public void clickPink() {
		driver.findElement(pink).click();
	}
}
