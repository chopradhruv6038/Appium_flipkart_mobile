package org.flipkart.pom;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.flipkart.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BaseTest {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement flipkartLogo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    private WebElement searchForProductsBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")
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
