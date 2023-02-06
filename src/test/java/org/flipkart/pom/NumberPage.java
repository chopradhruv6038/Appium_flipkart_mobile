package org.flipkart.pom;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.flipkart.Base.BaseTest;
import org.openqa.selenium.WebElement;

public class NumberPage extends BaseTest {

    @AndroidFindBy(id = "com.google.android.gms:id/cancel") private WebElement noneOfTheAboveLnk;

    @AndroidFindBy(id = "com.flipkart.android:id/custom_back_icon") private WebElement crossIcon;



    //methods uer actions


    public NumberPage clickNoneOfTheAboveLink(){

        click(noneOfTheAboveLnk);

        return this;
    }

public HomePage clickCrossIcon(){

        click(crossIcon);

        return new HomePage();
}



}
