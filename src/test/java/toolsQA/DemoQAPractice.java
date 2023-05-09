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
import java.util.Set;

public class DemoQAPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://demoqa.com/browser-windows");
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
        WebElement windowButton = chromeDriver.findElement(By.id("windowButton"));
        windowButton.click();

        String mainWindowHandle = chromeDriver.getWindowHandle();
        Set<String> allWindowHandle = chromeDriver.getWindowHandles();
        Iterator<String> iterator = allWindowHandle.iterator();

        while(iterator.hasNext())
        {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow))
            {
                chromeDriver.switchTo().window(ChildWindow);
            }
        }
        Thread.sleep(3000);
        chromeDriver.quit();





















    }
}
