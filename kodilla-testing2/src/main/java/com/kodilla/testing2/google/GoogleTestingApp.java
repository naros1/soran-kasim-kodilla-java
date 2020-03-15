package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static  final String SERCHFIELD = "q";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHORME);
        driver.get("https://www.google.com");

        WebElement serchField = driver.findElement(By.name(SERCHFIELD));
        serchField.sendKeys("Kodilla");
        serchField.submit();
    }
}
