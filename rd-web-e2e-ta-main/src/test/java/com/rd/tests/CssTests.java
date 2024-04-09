package com.rd.tests;

import com.rd.drivers.Driver;
import com.rd.utils.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class CssTests {

    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL");



    @BeforeMethod
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test
    public void openDemoQAPageTest() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"DEMOQA");
    }

    @Test
    public void clickButtons(){
        WebElement Buttons = driver.findElement(By.cssSelector("#item-4"));
        Buttons.click();
    }

    @Test
    public void clickMeClick(){
        WebElement clickMe = driver.findElement(By.cssSelector("#I548k"));
        clickMe.click();
    }

    @Test
    public void read(){
        WebElement readText = driver.findElement(By.cssSelector("#dynamicClickMessage"));
        String text = readText.getText();
        Assert.assertEquals(text, "You have done a dynamic click");
    }

    @AfterMethod
    public void close(){
        webDriver.quitDriver();
    }
}
