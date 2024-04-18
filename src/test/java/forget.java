import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class forget {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://staginglinkfoot.softylines.com/auth/jwt/login");
        WebElement mdp = driver.findElement(By.xpath("//a[normalize-space()='Mot de passe oublié?']"));
        mdp.click();
        WebElement email = driver.findElement(By.xpath("(//input[@id=':r0:'])[1]"));
        email.sendKeys("ahmedsdiri@takiacademyteam.com");
        email.click();
        WebElement envoyer = driver.findElement(By.xpath("(//button[normalize-space()='Envoyer la demande'])[1]"));
        envoyer.click();
        // Initialisez le JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Exécutez du JavaScript pour ouvrir une nouvelle fenêtre
        js.executeScript("window.open('https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=150&ct=1713364904&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26culture%3den-us%26country%3dus%26RpsCsrfState%3d2f19e8d9-4690-c6c7-5674-9e8cc4840d6d&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c','_blank');");
        // Obtenez les identifiants des fenêtres actuellement ouvertes
        for (String windowHandle : driver.getWindowHandles()) {
            // Passez à la nouvelle fenêtre
            driver.switchTo().window(windowHandle);
        }
        WebElement email1 = driver.findElement(By.xpath("(//input[@id='i0116'])[1]"));
        email1.sendKeys("ahmedsdiri@takiacademyteam.com");
        email1.click();
        WebElement next = driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
        next.click();
        WebElement psd = driver.findElement(By.xpath("(//input[@id='i0118'])[1]"));
        psd.sendKeys("Rux95633");
        psd.click();
        WebElement login = driver.findElement(By.xpath("(//input[@id='idSIButton9'])[1]"));
        login.click();
        WebElement dontshow = driver.findElement(By.xpath("//input[@id='KmsiCheckboxField']"));
        dontshow.click();
        WebElement yes = driver.findElement(By.xpath("(//input[@id='idSIButton9'])[1]"));
        yes.click();
        Thread.sleep(5000);
        WebElement msg = driver.findElement(By.xpath("(//div[@class='XG5Jd TszOG'])[1]"));
        msg.click();
        Thread.sleep(5000);
        // Recherchez l'élément contenant le code de confirmation
        WebElement confirmationElement = driver.findElement(By.xpath("//p[1]"));
        Thread.sleep(2000);
        // Récupérez le texte à partir de l'élément
        String confirmationText = confirmationElement.getText();
        Thread.sleep(1000);
        // Use regular expression to find 6-digit code in the text
        Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
        Matcher matcher = pattern.matcher(confirmationText);
        String confirmationCode = null;
        if (((Matcher) matcher).find()) {
            confirmationCode = matcher.group();
            System.out.println("Code de confirmation : " + confirmationCode);
        } else {
            System.out.println("Aucun code de confirmation trouvé.");
        }
        if (confirmationCode != null) {
        // Switch back to the original window
        driver.switchTo().window(driver.getWindowHandles().iterator().next());
        // Copy confirmation code to clipboard
        WebElement confirmationInput = driver.findElement(By.xpath("(//input[@id=':r3:'])[1]"));
        confirmationInput.sendKeys(confirmationCode);
        //confirmationInput.click();
        Thread.sleep(1000);
        WebElement motdepasse = driver.findElement(By.xpath("(//input[@id=':r9:'])[1]"));
        motdepasse.sendKeys("123456Aa@");
        WebElement confirmmotdepasse = driver.findElement(By.xpath("//input[@id=':ra:']"));
        confirmmotdepasse.sendKeys("123456Aa@");
        WebElement ok = driver.findElement(By.xpath("//button[@id=':rb:']"));
        ok.click();
            try {
            System.out.println("Réinitialisation du mot de passe réussie !");
        } catch (Exception e) {
            // If any exception occurs, print a failure message
            System.out.println("Échec de la réinitialisation du mot de passe : " + e.getMessage());
        } finally {
                Thread.sleep(3000);
            // Close the browser regardless of success or failure
            driver.quit();
    }
}
    }
}


