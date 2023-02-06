package org.flipkart.pom;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.flipkart.Base.BaseTest;
import org.openqa.selenium.WebElement;

public class LanguagePage extends BaseTest {


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout")
   // @iOSXCUITFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout")
    private WebElement selectEnglishLang;

    @AndroidFindBy(id = "com.flipkart.android:id/select_btn")private WebElement continueBtn;



//methods user actions:


   public LanguagePage clickEnglishLanguage(){

       click(selectEnglishLang);

        return this;

    }


public NumberPage clickContinueBtn(){


       click(continueBtn);

       return new NumberPage();
}


}
