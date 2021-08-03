package com.automation.stepdef;

//import cucumber.annotation.en.Given;
import com.driver.factory.loadDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.css.sac.ElementSelector;

import  java.lang.System;
import java.sql.Driver;

public class LoginStepDef {

//    //WebDriver driver = (WebDriver) new loadDriver();
//    @Given("I am on the login screen")
//    public void loginScreen(){
//
//    }


    public String txtUsername ="//input[@name='user-name']";
    public String txtPassword ="//input[@name='password']";
    public String btnLogin ="//input[@name='login-button']";



    public String btnAddToCart ="//button[@name='add-to-cart-sauce-labs-backpack']";

    public String txtTitle ="//span[@class='title']";


    public String txtInventoryItem ="//div[@class='inventory_item_name']";
    public String txtShoppingCart ="//a[@class='shopping_cart_link']";

    //public String txtUsername ="//div[@class='inventory_item_name']";
    //Sauce Labs Backpack


    public String btnCheckout ="//button[@id='checkout']";

    public String txtFirstName ="//input[@id='first-name']";

    public String txtLastName ="//input[@id='last-name']";

    public String txtPostalCode ="//input[@id='postal-code']";

    public String btnClickContinue ="//input[@id='continue']";

    public String hdrSummaryInfo ="//div[@class='summary_info']";

    public String btnFinish ="//button[@id='finish']";

    public String hdrCompleteOrder ="//h2[@class='complete-header']";



    public WebDriver driver= null;

    @Given("^I am on the login screen$")
    public void loginScreen() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\F3821811\\IdeaProjects\\Demo\\src\\Drivers\\Web\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

        }catch(Exception e){

            System.out.println(e.getMessage());
        }
    }

    @And("^I enter (.*) in username text box$")
    public void enterUsername(String username) throws InterruptedException {


       WebElement Username = driver.findElement(By.xpath(txtUsername));
        Username.sendKeys(username);
        Thread.sleep(1000);

    }
    @And("^I enter (.*) in password text box$")
    public void enterPassword(String password) throws InterruptedException {


        WebElement Password = driver.findElement(By.xpath(txtPassword));
        Password.sendKeys(password);
        Thread.sleep(1000);
    }
    @And("^I click on login button$")
    public void clickLogin() throws InterruptedException {

        WebElement Login = driver.findElement(By.xpath(btnLogin));
        Login.click();
        Thread.sleep(1000);
    }
    @And("^I click on add to cart$")
    public void clickAddToCart() throws InterruptedException {
        WebElement Login = driver.findElement(By.xpath(btnAddToCart));
        Login.click();
        Thread.sleep(1000);
    }
    @And("^I validate that cart details$")
    public void ValidateCartDetails() {

    }
    @And("^I click on the shopping cart$")
    public void clickShoppingCart() throws InterruptedException {
        WebElement Login = driver.findElement(By.xpath(txtShoppingCart));
        Login.click();
        Thread.sleep(2000);
    }
    @And("^I validate the item is in the shopping cart$")
    public void ValidateCartItems() {

    }
    @And("^I click on checkout$")
    public void clickCheckout() throws InterruptedException {
        WebElement Login = driver.findElement(By.xpath(btnCheckout));
        Login.click();
        Thread.sleep(2000);

    }
    @And("^I enter (.*) in firstname text box$")
    public void Enterfirstname(String firstname) throws InterruptedException {
        WebElement Username = driver.findElement(By.xpath(txtFirstName));
        Username.sendKeys(firstname);
        Thread.sleep(2000);

    }
    @And("^I enter (.*) in lastname text box$")
    public void Enterlastname(String lastname) throws InterruptedException {
        WebElement Username = driver.findElement(By.xpath(txtLastName));
        Username.sendKeys(lastname);
        Thread.sleep(2000);

    }
    @And("^I enter (.*) in zipcode text box$")
    public void EnterZipCode(String zipcode) throws InterruptedException {
        WebElement Username = driver.findElement(By.xpath(txtPostalCode));
        Username.sendKeys(zipcode);
        Thread.sleep(2000);

    }
    @And("^I click on continue$")
    public void ClickContinue() throws InterruptedException {
        WebElement Login = driver.findElement(By.xpath(btnClickContinue));
        Login.click();
        Thread.sleep(2000);

    }
    @And("^I validate the order summary details$")
    public void ValidateOrder() {

    }
    @And("^I click on finish$")
    public void clickFinish() throws InterruptedException {
        WebElement Login = driver.findElement(By.xpath(btnFinish));
        Login.click();
        Thread.sleep(2000);

    }
    @And("^I validate order completion$")
    public void ValidateOrderCompletion() {

    }
    @And("^I validate that i have logged in$")
    public void ValidateLogin() throws InterruptedException {
        WebElement Text = driver.findElement(By.xpath(txtTitle));
        String Products=Text.getText();
        if (Products.equals("PRODUCTS")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        Thread.sleep(1000);
    }

}
