package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE_POLICY = "//div[@class=\"_9xo5\"]/button[2]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_WAITING_FOR = "//div[@class=\"_5k_5\"]";
    public static final String XPATH_SELECT_BIRHTDAY_DAY = "//select[@name=\"birthday_day\"]";
    public static final String XPATH_SELECT_BIRHTDAY_MONTH = "//select[@name=\"birthday_month\"]";
    public static final String XPATH_SELECT_BIRHTDAY_YEAR = "//select[@name=\"birthday_year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIE_POLICY)).click();

        driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        while (!driver.findElement(By.xpath(XPATH_WAITING_FOR)).isDisplayed());

        WebElement selectComboBirthdayDay = driver.findElement(By.xpath(XPATH_SELECT_BIRHTDAY_DAY));
        Select selectBoardDay = new Select(selectComboBirthdayDay);
        selectBoardDay.selectByIndex(7);

        WebElement selectComboBirthdayMonth = driver.findElement(By.xpath(XPATH_SELECT_BIRHTDAY_MONTH));
        Select selectBoardMonth = new Select(selectComboBirthdayMonth);
        selectBoardMonth.selectByIndex(4);

        WebElement selectComboBirthdayYear = driver.findElement(By.xpath(XPATH_SELECT_BIRHTDAY_YEAR));
        Select selectBoardYear = new Select(selectComboBirthdayYear);
        selectBoardYear.selectByIndex(31);
    }
}
