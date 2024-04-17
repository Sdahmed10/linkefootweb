import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Authfailedandpassed {
    private WebDriver driver;
    private String baseUrl = "";


    @BeforeClass
    public void setUp(){
        //set up webdriver and navigate to the login page

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @Test
    public void testInvalidlogin(){
        //unseccessfull login scenario
        WebElement nameofclub = driver.findElement(By.xpath(""));
        nameofclub.sendKeys("");
        nameofclub.click();
        WebElement email = driver.findElement(By.xpath(""));
        email.sendKeys("");
        email.click();
        WebElement pswd = driver.findElement(By.xpath(""));
        pswd.sendKeys("");
        pswd.click();
        WebElement confirmpswd = driver.findElement(By.xpath(""));
        confirmpswd.sendKeys("");
        confirmpswd.click();
        WebElement phone = driver.findElement(By.xpath(""));
        phone.sendKeys("");
        phone.click();
        WebElement accept = driver.findElement(By.xpath(""));
        accept.click();
        WebElement next = driver.findElement(By.xpath(""));
        next.click();
        System.out.println("unseccessfull login");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save screenshot
        try {
            FileUtils.copyFile(screenshotFile, new File("/Users/takiacademy/Documents/capture1.png"));
            System.out.println("Capture d'écran effectuée avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void invalidlogin(){
        //login with empty field
        WebElement nameofclub = driver.findElement(By.xpath(""));
        nameofclub.sendKeys("");
        nameofclub.click();
        WebElement email = driver.findElement(By.xpath(""));
        email.sendKeys("");
        email.click();
        WebElement pswd = driver.findElement(By.xpath(""));
        pswd.sendKeys("");
        pswd.click();
        WebElement confirmpswd = driver.findElement(By.xpath(""));
        confirmpswd.sendKeys("");
        confirmpswd.click();
        WebElement phone = driver.findElement(By.xpath(""));
        phone.sendKeys("");
        phone.click();
        WebElement accept = driver.findElement(By.xpath(""));
        accept.click();
        WebElement next = driver.findElement(By.xpath(""));
        next.click();
        System.out.println("unseccessfull login");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save screenshot
        try {
            FileUtils.copyFile(screenshotFile, new File("/Users/takiacademy/Documents/capture2.png"));
            System.out.println("Capture d'écran effectuée avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void invalidlogin1(){
        //login without accept click
        WebElement nameofclub = driver.findElement(By.xpath(""));
        nameofclub.sendKeys("");
        nameofclub.click();
        WebElement email = driver.findElement(By.xpath(""));
        email.sendKeys("");
        email.click();
        WebElement pswd = driver.findElement(By.xpath(""));
        pswd.sendKeys("");
        pswd.click();
        WebElement confirmpswd = driver.findElement(By.xpath(""));
        confirmpswd.sendKeys("");
        confirmpswd.click();
        WebElement phone = driver.findElement(By.xpath(""));
        phone.sendKeys("");
        phone.click();
        //WebElement accept = driver.findElement(By.xpath(""));
        //accept.click();
        WebElement next = driver.findElement(By.xpath(""));
        next.click();
        System.out.println("unseccessfull login");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save screenshot
        try {
            FileUtils.copyFile(screenshotFile, new File("/Users/takiacademy/Documents/capture3.png"));
            System.out.println("Capture d'écran effectuée avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testvalidlogin(){
        //unseccessfull login scenario
        WebElement nameofclub = driver.findElement(By.xpath(""));
        nameofclub.sendKeys("");
        nameofclub.click();
        WebElement email = driver.findElement(By.xpath(""));
        email.sendKeys("");
        email.click();
        WebElement pswd = driver.findElement(By.xpath(""));
        pswd.sendKeys("");
        pswd.click();
        WebElement confirmpswd = driver.findElement(By.xpath(""));
        confirmpswd.sendKeys("");
        confirmpswd.click();
        WebElement phone = driver.findElement(By.xpath(""));
        phone.sendKeys("");
        phone.click();
        WebElement accept = driver.findElement(By.xpath(""));
        accept.click();
        WebElement next = driver.findElement(By.xpath(""));
        next.click();
        System.out.println("seccessfull login");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Save screenshot
        try {
            FileUtils.copyFile(screenshotFile, new File("/Users/takiacademy/Documents/capture4.png"));
            System.out.println("Capture d'écran effectuée avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public void tearDown(){
        //close the browser
        driver.quit();
    }
}

