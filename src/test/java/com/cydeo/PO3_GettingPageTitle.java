package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO3_GettingPageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);

        if (title.equals("Cydeo")){
            System.out.println("test pass");
        }else {
            System.out.println("test faild");
        }

        driver.close();
    }
}
