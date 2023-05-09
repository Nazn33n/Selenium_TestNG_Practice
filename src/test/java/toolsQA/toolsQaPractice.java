package toolsQA;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class toolsQaPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/text-box");
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement fullName = chromeDriver.findElement(By.xpath("//input[@id='userName']")); //xpath locator
        fullName.sendKeys("Nazneen Rahman");
        WebElement emailAddress = chromeDriver.findElement(By.id("userEmail"));
        emailAddress.sendKeys("naz@yopmail.com");
        WebElement currentAddress = chromeDriver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Monipuripara");
        WebElement permanentAddress = chromeDriver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Monipuripara, Farmgate");

        WebElement submitButton = chromeDriver.findElement(By.id("submit"));
        submitButton.click();

        Thread.sleep(3000);
        chromeDriver.quit();


    }
}
