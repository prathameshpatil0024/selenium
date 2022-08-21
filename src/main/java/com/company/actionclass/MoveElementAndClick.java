package com.company.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElementAndClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", titleA);
        actions.moveToElement(titleA, 0, 500);
        actions.release().perform();
        driver.close();
    }
}
