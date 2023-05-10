package toolsQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DemoQAPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
//        chromeDriver.get("https://demoqa.com/browser-windows");
        //New tab
//        WebElement tabButton = chromeDriver.findElement(By.id("tabButton"));
//        tabButton.click();
//        Thread.sleep(3000);
//        ArrayList<String> windowDifferentTab =new ArrayList(chromeDriver.getWindowHandles()); //added arraylist
//        chromeDriver.switchTo().window(windowDifferentTab.get(1));
//        WebElement text = chromeDriver.findElement(By.id("sampleHeading"));
//        String text1 = text.getText();
//        System.out.println("The text title of the page is : " + text1);
//        Assert.assertEquals(text1, "This is a sample page");
//        chromeDriver.close();
//        chromeDriver.switchTo().window(windowDifferentTab.get(0));
//        chromeDriver.quit();
        //New Window
//        WebElement windowButton = chromeDriver.findElement(By.id("windowButton"));
//        windowButton.click();
//
//        String mainWindowHandle = chromeDriver.getWindowHandle();
//        Set<String> allWindowHandle = chromeDriver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandle.iterator();
//
//        while(iterator.hasNext())
//        {
//            String ChildWindow = iterator.next();
//            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow))
//            {
//                chromeDriver.switchTo().window(ChildWindow);
//            }
//        }
//        Thread.sleep(3000);
//        chromeDriver.quit();
        //Add Data to the WebTable
//        chromeDriver.get("https://demoqa.com/webtables");
//        WebElement addButton = chromeDriver.findElement(By.id("addNewRecordButton"));
//        addButton.click();
//        WebElement firstName = chromeDriver.findElement(By.id("firstName"));
//        firstName.sendKeys("Nazneen");
//        WebElement lastName = chromeDriver.findElement(By.id("lastName"));
//        lastName.sendKeys("Rahman");
//        WebElement userEmail = chromeDriver.findElement(By.id("userEmail"));
//        userEmail.sendKeys("naz@yopmail.com");
//        WebElement age = chromeDriver.findElement(By.id("age"));
//        age.sendKeys("27");
//        WebElement salary = chromeDriver.findElement(By.id("salary"));
//        salary.sendKeys("1");
//        WebElement department = chromeDriver.findElement(By.id("department"));
//        department.sendKeys("SQA ENGINEER");
//        WebElement submitButton = chromeDriver.findElement(By.id("submit"));
//        submitButton.click();
//        Thread.sleep(3000);
//        chromeDriver.quit();
        //Edit Data from the WebTable
        chromeDriver.get("https://demoqa.com/webtables");
        WebElement editButton = chromeDriver.findElement(By.id("edit-record-1"));
        editButton.click();
        WebElement firstName = chromeDriver.findElement(By.id("firstName"));
        firstName.click();
        firstName.clear();
        firstName.sendKeys("Nazneen");
        WebElement lastName = chromeDriver.findElement(By.id("lastName"));
        lastName.click();
        lastName.clear();
        lastName.sendKeys("Rahman");
        WebElement userEmail = chromeDriver.findElement(By.id("userEmail"));
        userEmail.click();
        userEmail.clear();
        userEmail.sendKeys("naz@yopmail.com");
        WebElement age = chromeDriver.findElement(By.id("age"));
        age.click();
        age.clear();
        age.sendKeys("27");
        WebElement salary = chromeDriver.findElement(By.id("salary"));
        salary.click();
        salary.clear();
        salary.sendKeys("1");
        WebElement department = chromeDriver.findElement(By.id("department"));
        department.click();
        department.clear();
        department.sendKeys("SQA ENGINEER");
        WebElement submitButton = chromeDriver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(3000);
        chromeDriver.quit();

//      Data scrap from the table

    }
}
