import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://devstudenthelp.softylines.com/login");

        WebElement email = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > main:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
        email.sendKeys("firas@admin.com");
        email.click();
        WebElement psw = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > main:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)"));
        psw.sendKeys("admin1234");
        psw.click();

        WebElement login = driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));
        login.click();
        WebElement add = driver.findElement(By.xpath("//a[normalize-space()='Add Student']"));
        add.click();
        WebElement upload = driver.findElement(By.xpath("(//div[@class='placeholder css-1q7a0pc'])[1]"));
        upload.click();


    }
}
