package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@name='Month']"));
        Select drpDown = new Select(element);
        drpDown.selectByVisibleText("January");
        drpDown.selectByValue("Feb");
        drpDown.selectByIndex(3);
        drpDown.selectByVisibleText("April");
        drpDown.selectByVisibleText("May");
        drpDown.selectByVisibleText("June");
        drpDown.deselectByVisibleText("January");
        drpDown.deselectByIndex(2);
        drpDown.deselectAll();
        Thread.sleep(5000);
        driver.close();
    }
}
