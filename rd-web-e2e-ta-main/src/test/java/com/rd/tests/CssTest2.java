package com.rd.tests;

import com.rd.drivers.Driver;
import com.rd.utils.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class CssTest2 {

    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL2");

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
    public void clickWebTables(){
        WebElement WebTables = driver.findElement(By.cssSelector("#item-3"));
        WebTables.click();
    }

    @Test
    public void Add(){
        WebElement Add = driver.findElement(By.cssSelector("#addNewRecordButton"));
        Add.click();
    }

    @Test
    public void firstName(){
        WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
        firstName.click();
        firstName.sendKeys("Gizem");
    }

    @Test
    public void lastName(){
        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.click();
        lastName.sendKeys("Zobarlar");
    }

    @Test
    public void eMail(){
        WebElement eMail = driver.findElement(By.cssSelector("#userEMail"));
        eMail.click();
        eMail.sendKeys("asd@gmail.com");
    }

    @Test
    public void age(){
        WebElement age = driver.findElement(By.cssSelector("#age"));
        age.click();
        age.sendKeys("29");
    }

    @Test
    public void salary(){
        WebElement salary = driver.findElement(By.cssSelector("#salary"));
        salary.click();
        salary.sendKeys("1000");
    }

    public void department(){
        WebElement department = driver.findElement(By.cssSelector("#department"));
        department.click();
        department.sendKeys("TEST");
    }

    public void submit(){
        WebElement submit = driver.findElement(By.cssSelector("#submit"));
        submit.click();
    }

    public void edit(){
        WebElement edit = driver.findElement(By.cssSelector("span#edit-record-1"));
        edit.click();
    }

    @Test
    public void newAge(){
        WebElement newAge = driver.findElement(By.cssSelector("#age"));
        newAge.click();
        newAge.sendKeys("28");
    }

    public void submitClick(){
        WebElement submitClick = driver.findElement(By.cssSelector("#submit"));
        submitClick.click();
    }

    @AfterMethod
    public void close(){
        webDriver.quitDriver();
    }
}