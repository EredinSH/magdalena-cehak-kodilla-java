package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://eredinsh.github.io/";
    private WebDriver driver;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }

    @Test
    public void shouldCreateTrelloCard() {
        final String XPATH_TASK_NAME = "/html/body/main/section[1]/form/fieldset[1]/input"; 
        final String XPATH_TASK_CONTENT = "";
        final String XPATH_ADD_BUTTON = ""; }

}
