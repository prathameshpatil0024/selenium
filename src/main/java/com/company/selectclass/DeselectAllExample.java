package com.company.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAllExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        driver.manage().window().maximize();
        WebElement dropdown  = driver.findElement(By.xpath("//select[@name='Month']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("May");
        select.selectByValue("Ap");
        select.selectByIndex(10);
        Thread.sleep(5000);
        select.deselectByVisibleText("May");
        select.deselectAll();
        Thread.sleep(5000);
        driver.close();
    }
}
