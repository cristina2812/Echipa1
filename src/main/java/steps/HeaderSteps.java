package steps;

import net.thucydides.core.annotations.Step;

import org.junit.Assert;
import page.HeaderPage;
import page.ProductPage;
import page.ProductsListPage;

public class HeaderSteps {

    HeaderPage headerPage;
    ProductsListPage productsListPage;

    @Step
    public void showPageTitle(String title) {
        headerPage.getGreetMessage();
        Assert.assertEquals(headerPage.getPageTile(), title);
    }

    @Step
    public void showWebUrl(String url) {
        Assert.assertEquals(headerPage.getSiteUrl(), url);
    }

    @Step
    public void showLogo(String url) {
        Assert.assertTrue(headerPage.seeIfLogoIsDisplayed());
        headerPage.clickOnLogo();
        Assert.assertEquals(headerPage.getSiteUrl(), url);

    }

    @Step
    public void checkIfAccountIsDisplayed() {
        headerPage.clickOnAccountDropdown();
        Assert.assertTrue(headerPage.seeIfAccountListIsDIsplayed());
        Assert.assertEquals(headerPage.seeAccount(), "ACCOUNT");
    }

    @Step
    public void checkIfLanguageChanged() {
        headerPage.selectLanguageValue();
    }

    @Step
    public void checkSizeLanguageOption() {
        int sizeLanguage = headerPage.sizeOptionLanguage();
        Assert.assertEquals(3, sizeLanguage);
    }

    @Step
    public void insertKeywordInSearchField(String key) {
        headerPage.changeFieldSearch(key);
        String getInsertInFieldSearch = headerPage.getSearchField();
        headerPage.clickSearchBtn();
        String getPageTitleSearch = headerPage.getPageTitleSearch();
        Assert.assertTrue(getPageTitleSearch.contains(getInsertInFieldSearch));
    }

    @Step
    public void checkHeaderTitles() {
        headerPage.getHeaderTitles();
        headerPage.clickOnSpecificTitle();
        Assert.assertEquals(headerPage.getSiteUrl(), "http://qa2.dev.evozon.com/sale.html");
    }

    @Step
    public void checkMainNavigationOptions() {
        headerPage.getMainNavigationOptions();
    }

    @Step
    public void checkWomenSubcategoryStep() {
        headerPage.checkWomenSubcategory();
    }


    @Step
    public void clickLoginBtn() {
        headerPage.clickOnAccountDropdown();
        headerPage.clickOnLoginHeader();
    }

    @Step
    public void checkMenSubcategoryStep() {
        headerPage.checkMenSubcategory();
    }

    @Step
    public void getAccesoriesSubcategoryOptionsp() {
        headerPage.checkAccesoriesSubcategory();
    }

    @Step
    public void getAccesoriesSubcategoryOptions() {
        headerPage.checkAccesoriesSubcategory();
    }

    @Step
    public void getHomeOptions() {
        headerPage.checkHomeSubcategory();
    }

    @Step
    public void getSaleOptions() {
        headerPage.checkSaleSubcategory();
    }

    @Step
    public void getVipOptions() {
        headerPage.checkVipSubcategory();
    }

/*    @Step
    public void  getMenSubDDT() {
        headerPage.clickMenSubcategoryDDT();
    }*/

    @Step
    public void insertKeywordInSearchFieldDDT(String key) {
        headerPage.changeFieldSearch(key);
        headerPage.clickSearchBtn();
        headerPage.clearSearchInput();
    }

}
