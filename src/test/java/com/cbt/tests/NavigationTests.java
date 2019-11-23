package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtilities.verifyEquals;

public class NavigationTests {
    public static void main(String[] args) {
      //  testFireFox();
        testChrome();
    }

    public static void testFireFox() {
        WebDriver driver = BrowserFactory.getDriver("Firefox");
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        verifyEquals(etsyTitle, driver.getTitle());

        driver.close();

    }

    public static void testChrome() {
        WebDriver driver = BrowserFactory.getDriver("Chrome");
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        driver.navigate().back();
        verifyEquals(googleTitle, driver.getTitle());
        driver.navigate().forward();
        verifyEquals(etsyTitle, driver.getTitle());

        driver.close();
    }

}