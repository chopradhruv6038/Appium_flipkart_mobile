package org.flipkart.Tests;

import org.flipkart.Base.BaseTest;
import org.flipkart.pom.CategoriesPage;
import org.flipkart.pom.HomePage;
import org.flipkart.pom.LanguagePage;
import org.flipkart.pom.NumberPage;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class NavigateToHomePageTests extends BaseTest {

    InputStream DataIs;
    JSONObject userData;


    LanguagePage languagePage;
    NumberPage numberPage;
    HomePage homePage;
    CategoriesPage categoriesPage;

    @BeforeClass
    public void beforeClass() throws IOException {

        try {
            String filePath = "Data/Data.json";

            DataIs = getClass().getClassLoader().getResourceAsStream(filePath);

            JSONTokener tokener = new JSONTokener(DataIs);

            userData = new JSONObject(tokener);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (DataIs != null) {
                DataIs.close();

            }
        }
    }

    @BeforeMethod
    public void beforeMethod(Method m) {

        languagePage = new LanguagePage();
        numberPage = new NumberPage();
        homePage = new HomePage();
        categoriesPage = new CategoriesPage();

        System.out.println("**** Method Name : " + m.getName() + " ****");

    }

    @Test
    public void NavigateToHmPgAndAssert() {

        languagePage.clickEnglishLanguage();
        numberPage = languagePage.clickContinueBtn();
        homePage = numberPage.clickNoneOfTheAboveLink().clickCrossIcon();
        homePage.assertFlipKartLogo();
        homePage.assertSeachForProductsBox(userData.getJSONObject("ExpectedHomePage").getString("SearchBoxText"));
        //categoriesPage = homePage.clickCategoriesIcon();
    }


}
