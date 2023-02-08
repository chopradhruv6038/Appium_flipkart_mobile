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

public class CategoriesPageTests extends BaseTest {


    InputStream DataIs;
    JSONObject userData;


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

        homePage = new HomePage();
        categoriesPage = new CategoriesPage();


        System.out.println("\n" + "**** Method Name : " + m.getName() + " ****" + "\n");

    }

    @Test
    public void categoriesAssertions() {

        categoriesPage = homePage.clickCategoriesIcon();
        categoriesPage.assertCategoriesTitle()
                .assertSearchIcon()
                .assertVoiceSearch()
                .asserOfferZoneIcon()
                .asserMobileIcon()
                .assertFashionIcon()
                .assertElectronicsIcon()
                .assertPersonalIcon()
                .assertHomeServicesIcon();

    }


}
