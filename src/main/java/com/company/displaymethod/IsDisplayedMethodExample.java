package com.company.displaymethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Ganesh_Automation\\Study\\AutomationLearningLab\\SeleniumProject\\src\\com\\company\\browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        driver.manage().window().maximize();
        WebElement red = driver.findElement(By.xpath("//input[@name='color' and @value='red']"));
        if (red.isEnabled()) {
            System.out.println("Red checkbox is enabled. Return: " + red.isEnabled());
            red.click();
            if (red.isSelected()) {
                System.out.println("Red checkbox is selected. Return: " + red.isSelected());
            } else {
                System.out.println("Red checkbox is not selected. Return: " + red.isSelected());
            }
        } else {
            System.out.println("Red checkbox is not enabled. Return: " + red.isEnabled());
        }
        WebElement opera = driver.findElement(By.xpath("//input[@name='browser' and @value='Opera']"));
        if (opera.isSelected()) {
            System.out.println("Radio button opera is selected. Return: " + opera.isSelected());
        } else {
            System.out.println("Radio button opera is not selected. Return: " + opera.isSelected());
        }
        driver.close();
    }
}