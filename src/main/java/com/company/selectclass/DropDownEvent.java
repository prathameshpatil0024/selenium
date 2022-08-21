package com.company.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEvent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='My Store']")).click();
        driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
        Select drpDown = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
//        drpDown.selectByVisibleText("Price: Highest first");
//        drpDown.selectByIndex(1);
        drpDown.selectByValue("price:desc");
        Thread.sleep(5000);
        drpDown.deselectByValue("price:desc");
        Thread.sleep(5000);
        driver.quit();
    }
}
