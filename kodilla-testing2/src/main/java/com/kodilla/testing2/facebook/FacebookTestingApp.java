package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp  {

    public static final String DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String COOKIES = "//div[contains(@class, \"_9xo5\")]/button[2]";
    public static final String NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a[1]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath(COOKIES)).click();
        driver.findElement(By.xpath(NEW_ACCOUNT)).click();

        Thread.sleep(2000);

        WebElement selectDay = driver.findElement(By.xpath(DAY));
        Select choosenDay = new Select(selectDay);
        choosenDay.selectByIndex(5);

        WebElement selectMonth = driver.findElement(By.xpath(MONTH));
        Select choosenMonth = new Select(selectMonth);
        choosenMonth.selectByIndex(1);

        WebElement selectYear = driver.findElement(By.xpath(YEAR));
        Select choosenYear = new Select(selectYear);
        choosenYear.selectByIndex(28);
    }

}
