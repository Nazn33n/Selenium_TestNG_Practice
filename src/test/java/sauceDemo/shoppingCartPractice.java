package sauceDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class shoppingCartPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.saucedemo.com/");
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//login to the saucedemo
        WebElement userName = chromeDriver.findElement(By.id("user-name")); //id locator
        userName.sendKeys("standard_user");

        WebElement password = chromeDriver.findElement(By.name("password")); //name locator
        password.sendKeys("secret_sauce");

        WebElement submitButton = chromeDriver.findElement(By.id("login-button"));
        submitButton.click();

        WebElement viewProductDetails = chromeDriver.findElement(By.partialLinkText("Bike Light")); //partialLinkText locator
        viewProductDetails.click();

        String getProductImageSource = chromeDriver.findElement(By.tagName("img")).getAttribute("src"); //tag name locator where used getattribute and set string as a method type
        System.out.println("Image View: " + getProductImageSource);

        WebElement backNavigationButton = chromeDriver.findElement(By.id("back-to-products"));
        backNavigationButton.click();

//add item to the cart
        WebElement addToCart = chromeDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
//click on the cart icon
        WebElement shoppingCart = chromeDriver.findElement(By.className("shopping_cart_badge")); //classname locator
        shoppingCart.click();
//proceed to checkout process
        WebElement checkoutButton = chromeDriver.findElement(By.id("checkout"));
        checkoutButton.click();
//added the check info
        WebElement firstName = chromeDriver.findElement(By.id("first-name"));
        firstName.sendKeys("Nazneen ");
        WebElement lastName = chromeDriver.findElement(By.id("last-name"));
        lastName.sendKeys("Rahman");
        WebElement postalCode = chromeDriver.findElement(By.id("postal-code"));
        postalCode.sendKeys("1215");

        WebElement continueButton = chromeDriver.findElement(By.id("continue"));
        continueButton.click();
        WebElement finishButton = chromeDriver.findElement(By.id("finish"));
        finishButton.click();

        Thread.sleep(3000);
        chromeDriver.quit();


    }
}
