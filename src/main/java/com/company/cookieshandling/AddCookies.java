package com.company.cookieshandling;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class AddCookies {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flipkart.com");
        Cookie name = new Cookie("mycookie", "1234567890");
        driver.manage().addCookie(name);
        Set<Cookie> cookiesList = driver.manage().getCookies();
        for (Cookie getCookies : cookiesList){
            System.out.println(getCookies);
        }
    }
}
