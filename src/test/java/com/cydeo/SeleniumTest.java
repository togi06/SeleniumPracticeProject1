package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {


        //1-Setting up the web driver manager
        WebDriverManager.chromedriver().setup();
        //2-Create instance of the chrome driver

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement cookies = driver.findElement(By.xpath("//div[.='Tümünü kabul et']"));
        cookies.click();

    }
}
