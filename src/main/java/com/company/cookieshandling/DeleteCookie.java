package com.company.cookieshandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flipkart.com");
        driver.manage().getCookies();
        driver.manage().getCookieNamed("mycookie");
//        driver.manage().deleteCookieNamed("mycookie");
//        driver.manage().deleteAllCookies();
        driver.close();
    }
}
