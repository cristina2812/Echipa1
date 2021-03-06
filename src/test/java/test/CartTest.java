package test;


import models.Product;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.ProductPage;
import page.ProductsListPage;
import steps.CartSteps;
import steps.HeaderSteps;
import steps.ProductSteps;

@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest {

    @Steps
    CartSteps cartSteps;
    @Steps
    HeaderSteps headerSteps;
    @Steps
    ProductSteps productSteps;
    @Steps
    ProductsListPage productsListPage;

    Product product;


    @Test
    public void clickOnCartIconBtn() {
        cartSteps.clickOnCart();
    }

    @Test
    public void testIfCartContainsZeroProduct() {
        cartSteps.clickOnCart();
        cartSteps.checkCartWrapperExist();
        cartSteps.checkCartWrapperMessage("You have no items in your shopping cart.");
    }

    @Test
    public void testIfCartContainsProducts() {
        product = new Product();
        headerSteps.insertKeywordInSearchField("glass");
        productsListPage.clickOnRandomProductFromList();

        product.setName(productSteps.returnProductName());
        product.setActualPrice(productSteps.returnProductPrice());

        productSteps.clickAddToCart();
        cartSteps.checkProductNameFromCartPage();
        cartSteps.checkProductNameFromCartContainsInitialName(product.getName());
        cartSteps.checkProductPriceFromCartContainsInitialPrice(product.getActualPrice());
        /*
            need to check total price
         */
    }

}
