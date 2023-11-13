package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import base.ProductDetailsPage;
import base.ProductDisplayPage;

public class PostComment extends BaseTest{
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
}
