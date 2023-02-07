package org.flipkart.pom;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.flipkart.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BaseTest {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[44,99][371,187]']")
    private WebElement flipkartLogo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='1'][@text='Search for products']")
    private WebElement searchForProductsBox;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[259,2024][391,2090]']")
    private WebElement categoriesIcon;


    //methods

    public HomePage assertFlipKartLogo() {

        assert (flipkartLogo).isDisplayed();
        assert (flipkartLogo).isEnabled();

        return this;
    }

    public String getText() {

        return getText(searchForProductsBox);
    }

    public String expectedSearchBoxText(String txt) {

        return txt;

    }

    public HomePage assertSeachForProductsBox(String txt) {

        assert (searchForProductsBox).isDisplayed();
        assert (searchForProductsBox).isEnabled();

        Assert.assertEquals(getText(), expectedSearchBoxText(txt));

        System.out.println("\n" + "Actual Search Box Text : " + getText() + "\n" + "Expected Search Box Text : " + expectedSearchBoxText(txt));

        return this;
    }

    public CategoriesPage clickCategoriesIcon() {

        click(categoriesIcon);

        return new CategoriesPage();
    }


}
