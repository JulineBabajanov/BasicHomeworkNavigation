package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for(String each: urls){
            driver.get(each);
            StringUtilities.verifyEquals("Practice", driver.getTitle());

        }for( int i = 0; i<urls.size();i++){
            String url = urls.get(i);
            Assert.assertTrue(url.startsWith("http://practice.cybertekschool.com"));

            System.out.println(urls.get(i));
        }
        driver.close();
    }
}
