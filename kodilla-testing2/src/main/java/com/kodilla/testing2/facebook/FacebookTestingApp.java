package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static  final String XPATH_NAME = "//div[contains(@class,\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\")]/input[1]";
    public static  final String XPATH_SURNAME = "//div[contains(@class,\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\") and 2]/input[1]";
    public static  final String XPATH_EMAIL = "//div[contains(@class,\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\") and 3]/input[1]";
    public static  final String XPATH_PASS = "//div[contains(@class,\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\") and 4]/input[1]";
    public static  final String XPATH_WAIT_FOR = "//div[contains(@class,\"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\")]/input[@name=\"reg_email_confirmation__\"]";
    public static  final String XPATH_DAY = "//div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    public static  final String XPATH_MONTH = "//div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    public static  final String XPATH_YEAR = "//div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHORME);
        driver.get("https://www.facebook.com/");

        WebElement serchField = driver.findElement(By.xpath(XPATH_NAME));
        serchField.sendKeys("John");

        WebElement surname = driver.findElement(By.xpath(XPATH_SURNAME));
        surname.sendKeys("Rambo");

        WebElement email = driver.findElement(By.xpath(XPATH_EMAIL));
        email.sendKeys("johnrambo@kboom.pow");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement emailConfirmation = driver.findElement(By.xpath(XPATH_WAIT_FOR));
        emailConfirmation.sendKeys("johnrambo@kboom.pow");

        WebElement pass = driver.findElement(By.xpath(XPATH_PASS));
        pass.sendKeys("123456789");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("4");

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(10);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1994");



}
}
