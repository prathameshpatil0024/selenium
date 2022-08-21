package com.company.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        List<WebElement> iFrameElement = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number " + iFrameElement.size());
        driver.switchTo().frame(1);
//        driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']")));
        driver.close();
    }
}
