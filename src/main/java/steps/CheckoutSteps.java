package steps;

import models.UserGuest;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.CheckoutPage;


public class CheckoutSteps {

    CheckoutPage checkoutPage;

    @Step
    public void clickCheckoutBtn() {
        checkoutPage.clickCheckOutAsGuestButton();

    }

    @Step
    public void fillRegisterDataInBillingInfo (UserGuest userGuest){
       checkoutPage.typeFirstName(userGuest.getFirstName());
       checkoutPage.typeLastName(userGuest.getLastName());
       checkoutPage.typeEmail(userGuest.getEmail());
       checkoutPage.typeCity(userGuest.getCity());
       checkoutPage.typeZipCode(userGuest.getZipCode());
       checkoutPage.typePhoneNumber(userGuest.getTelephone());
       checkoutPage.selectCountry(userGuest.getSelectCountry());
       checkoutPage.selectRegion(userGuest.getSelectState());
       checkoutPage.typeAddress(userGuest.getAddress());
    }

    @Step
    public void clickSelectShipToDifferentAddress() {
        checkoutPage.selectshipToDifferentAddressOption();
    }

    @Step
    public void clickShippingMethod(){
        checkoutPage.clickRadioButtonFreeShipping();
        checkoutPage.clickContinueShippingMethod();
    }

    @Step
    public void clickPaymentInformation(){
        checkoutPage.clickContinuePaymentInformation();
    }

    @Step
    public void clickOnContinueButtonFromBillingInformationCheckout() {
        checkoutPage.clickContinueButtonFromBillingInformationCheckout();
    }

    @Step
    public void clickOrderReview(){
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void fillRegisterDataInShippingInformation (UserGuest userGuest){

        checkoutPage.typeFirstNameInShipping(userGuest.getFirstName());
        checkoutPage.typeLastNameInShipping(userGuest.getLastName());
        checkoutPage.typeCityInShipping(userGuest.getCity());
        checkoutPage.typeZipCodeInShipping(userGuest.getZipCode());
        checkoutPage.typePhoneNumberInShipping(userGuest.getTelephone());
        checkoutPage.selectCountryInShipping(userGuest.getSelectCountry());
        checkoutPage.selectRegionInShipping(userGuest.getSelectState());
        checkoutPage.typeAddressInShipping(userGuest.getAddress());
    }

    @Step
    public void clickOnContinueButtonFromShippingInformation() {
        checkoutPage.clickContinueButtonFromShippingInformation();
    }
}

