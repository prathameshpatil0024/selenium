package com.company.uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadFiles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement browse = driver.findElement(By.id("file-upload"));
        browse.sendKeys("C:\\dcagentInstaller.log");
        driver.findElement(By.id("file-submit")).click();
        System.out.println("File is Uploaded Successfully");
        String checkText = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        if ("File Uploaded!".equalsIgnoreCase(checkText)) {
            System.out.println("Upload file success.");
        }else {
            System.out.println("File isn't uploaded");
        }
        driver.close();
    }
}
