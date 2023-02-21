package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO1_BasicNavigation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        WebElement cookies = driver.findElement(By.xpath("//div[.='Tümünü kabul et']"));
        cookies.click();

       // driver.get("https://www.google.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();



    }

}
