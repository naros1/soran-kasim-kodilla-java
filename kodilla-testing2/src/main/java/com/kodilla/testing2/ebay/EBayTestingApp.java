package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static  final String SERCHFIELD = "_nkw";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHORME);
        driver.get("https://www.ebay.com");

        WebElement serchField = driver.findElement(By.name(SERCHFIELD));
        serchField.sendKeys("Laptop");
        serchField.submit();
    }

}
