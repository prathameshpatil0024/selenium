package com.company.scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByVisibleElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
        WebElement srcElement = driver.findElement(By.id("draggable"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", srcElement);
        Thread.sleep(5000);
        driver.close();
    }
}
