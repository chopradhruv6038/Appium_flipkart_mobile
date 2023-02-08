package org.flipkart.pom;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.flipkart.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CategoriesPage extends BaseTest {

    @AndroidFindBy(id = "com.flipkart.android:id/title_action_bar")
    private WebElement categoriesPgTitle;

    @AndroidFindBy(accessibility = "Search")
    private WebElement searchIcon;

    @AndroidFindBy(id = "com.flipkart.android:id/search_by_voice_icon")
    private WebElement voiceSearchIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[0,220][270,538]']")
    private WebElement offerZoneIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[270,220][540,538]']")
    private WebElement mobilesIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[540,220][810,538]']")
    private WebElement fashionIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[810,220][1080,538]']")
    private WebElement electronicsIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[270,538][540,856]']")
    private WebElement personalCareIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[270,1492][540,1810]']")
    private WebElement homeServicesIcon;


//methods:

    public String getTextCategoriesPgTitle() {

        return getText(categoriesPgTitle);

    }

    public CategoriesPage assertCategoriesTitle() {

        assert categoriesPgTitle.isDisplayed();
        assert categoriesPgTitle.isEnabled();
        Assert.assertEquals(getTextCategoriesPgTitle(), "All Categories");
        System.out.println("Asserting categories Icon");

        return this;
    }

    public CategoriesPage assertSearchIcon() {

        assert searchIcon.isDisplayed();
        assert searchIcon.isDisplayed();
        System.out.println("Asserting search Icon");
        return this;
    }

    public CategoriesPage assertVoiceSearch() {

        assert voiceSearchIcon.isDisplayed();
        assert voiceSearchIcon.isDisplayed();
        System.out.println("Asserting voiceSearch Icon");
        return this;
    }

    public CategoriesPage asserOfferZoneIcon() {

        assert offerZoneIcon.isDisplayed();
        assert offerZoneIcon.isDisplayed();
        System.out.println("Asserting offerZone Icon");
        return this;
    }

    public CategoriesPage asserMobileIcon() {

        assert mobilesIcon.isDisplayed();
        assert mobilesIcon.isDisplayed();
        System.out.println("Asserting mobile Icon");
        return this;
    }

    public CategoriesPage assertFashionIcon() {

        assert fashionIcon.isDisplayed();
        assert fashionIcon.isDisplayed();
        System.out.println("Asserting fashion Icon");
        return this;
    }

    public CategoriesPage assertElectronicsIcon() {

        assert electronicsIcon.isDisplayed();
        assert electronicsIcon.isDisplayed();
        System.out.println("Asserting electronics Icon");
        return this;
    }

    public CategoriesPage assertPersonalIcon() {

        assert personalCareIcon.isDisplayed();
        assert personalCareIcon.isDisplayed();
        System.out.println("Asserting personal Icon");
        return this;
    }


    public CategoriesPage assertHomeServicesIcon() {

        assert homeServicesIcon.isDisplayed();
        assert homeServicesIcon.isDisplayed();
        System.out.println("Asserting homeServices Icon");
        return this;
    }

}
