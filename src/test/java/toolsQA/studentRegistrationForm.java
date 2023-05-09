package toolsQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class studentRegistrationForm {
    public static void main(String[] args) throws InterruptedException, IOException {
       WebDriverManager.chromedriver().setup();
       WebDriver chromeDriver = new ChromeDriver();
//alert dialog box check
//       chromeDriver.get("https://demoqa.com/alerts");
//       WebElement alertButton = chromeDriver.findElement(By.id("alertButton"));
//       alertButton.click();
//       Thread.sleep(2000);
//       chromeDriver.switchTo().alert().accept();
//press on the 'ok' button of the dialog box

//        WebElement confirmButton = chromeDriver.findElement(By.id("confirmButton"));
//        confirmButton.click();
//        Thread.sleep(2000);
//
//        chromeDriver.switchTo().alert().accept();
//        String confirmResult = chromeDriver.findElement(By.id("confirmResult")).getText();
//        System.out.printf("The text is:" +confirmResult);
//        Assert.assertTrue(confirmResult.contains("Cancel"));

//write something on the alert box
//        WebElement promtButton = chromeDriver.findElement(By.id("promtButton"));
//        promtButton.click();
//        Thread.sleep(2000);
//        chromeDriver.switchTo().alert().sendKeys("Naz");

////student form
//        chromeDriver.get("https://demoqa.com/automation-practice-form");
//        chromeDriver.manage().window().maximize();
//        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebElement firstName = chromeDriver.findElement(By.id("firstName"));
//        firstName.sendKeys("Nazneen");
//
//        WebElement lastName = chromeDriver.findElement(By.id("lastName"));
//        lastName.sendKeys("Rahman");
//
//        WebElement userEmail = chromeDriver.findElement(By.id("userEmail"));
//        userEmail.sendKeys("naz@yopmail.com");
//
//        WebElement genderType = chromeDriver.findElement(By.xpath("//label[contains(text(),'Female')]"));
//        genderType.click();
//
//        WebElement userNumber = chromeDriver.findElement(By.id("userNumber"));
//        userNumber.sendKeys("01705185068");

//Date Picker
//     chromeDriver.get("https://demoqa.com/date-picker");
//     WebElement datePicker = chromeDriver.findElement(By.id("datePickerMonthYearInput"));
//     Actions a=new Actions(chromeDriver);
//     a.moveToElement(datePicker).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
//     datePicker.sendKeys("06/05/2023");
//     datePicker.sendKeys(Keys.ENTER);
//     Thread.sleep(5000);

// Download a file
//        chromeDriver.get("https://demoqa.com/upload-download");
//        chromeDriver.manage().window().maximize();
//        WebElement downloadButton = chromeDriver.findElement(By.id("downloadButton"));
//        downloadButton.click();

// Upload a file
//        WebElement uploadFile = chromeDriver.findElement(By.id("uploadFile"));
//        uploadFile.click();
//        uploadFile.sendKeys("D:\\a");

//Select item from the drop-down
//     chromeDriver.get("https://demoqa.com/select-menu");
//     chromeDriver.manage().window().maximize();
//     WebElement dropDown = chromeDriver.findElement(By.id("oldSelectMenu"));
//     Select select = new Select(dropDown);
//     select.selectByValue("3");
//     Thread.sleep(3000);

//Scroll down the page
//     JavascriptExecutor js =(JavascriptExecutor)chromeDriver;
//     js.executeScript("window.scroll(0,600)");
//     Thread.sleep(3000);
//     WebElement multiplecars = chromeDriver.findElement(By.id("cars"));
//     Select select1 =new Select(multiplecars);
//     select1.selectByValue("volvo");
//     Thread.sleep(3000);

//MouseHovour
//     chromeDriver.get("https://green.edu.bd/");
//     chromeDriver.manage().window().maximize();
//     Actions a1=new Actions(chromeDriver);
//     List<WebElement> list = chromeDriver.findElements(By.xpath("//a[contains(text(),\"About Us\")]"));
//     a1.moveToElement(list.get(2)).perform();
//     Thread.sleep(3000);

//Double click button (First Way)
//        chromeDriver.get("https://demoqa.com/buttons");
//        chromeDriver.manage().window().maximize();
//        Actions a3=new Actions(chromeDriver);
//        WebElement doubleClickButton = chromeDriver.findElement(By.id("doubleClickBtn"));
//        a3.doubleClick(doubleClickButton).perform();
//        //Assert.assertTrue(doubleClickButton.contains("double"));
//        System.out.println("The text is" + doubleClickButton);
//        Thread.sleep(3000);
//        WebElement rightClickButton = chromeDriver.findElement(By.id("rightClickBtn"));
//        a3.contextClick(rightClickButton).perform();
//        Thread.sleep(3000);
//
////Double click button(Second way)
//        chromeDriver.get("https://demoqa.com/buttons");
//        chromeDriver.manage().window().maximize();
//        Actions a4=new Actions(chromeDriver);
//        List<WebElement> list= chromeDriver.findElements(By.cssSelector("[type=button]"));
//        a4.doubleClick(list.get(1));
//        Thread.sleep(3000);
//        a4.contextClick(list.get(2));
//        Thread.sleep(3000);

//Screenshot
//        chromeDriver.get("https://demoqa.com/");
//        chromeDriver.manage().window().maximize();
//        TakesScreenshot scrShot =((TakesScreenshot)chromeDriver);
//        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//        String time = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new Date());
//        String fileWithPath = "./src/test/resources/screenshorts/" + time + ".png";
//        File DestFile=new File(fileWithPath);
//        FileUtils.copyFile(SrcFile, DestFile);
//Keyboard Event
//        chromeDriver.get("https://www.google.com/");
//        chromeDriver.manage().window().maximize();
//        WebElement googleSearchField = chromeDriver.findElement(By.name("q"));
//        Actions a4 = new Actions(chromeDriver);
//        a4.moveToElement(googleSearchField).sendKeys("What is Software Testing?").doubleClick().click().contextClick().perform();
//        Thread.sleep(3000);


        chromeDriver.quit();
    }

}
