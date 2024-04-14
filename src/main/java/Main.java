import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class Main {
    public static void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys("Andrei Maniliuc");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("maniliuc.andrei11@gmail.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Bistrita");
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Bistrita Nasaud");
        WebElement element = driver.findElement(By.cssSelector(".btn.btn-primary"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        String name = driver.findElement(By.cssSelector("#name")).getText();
        Assert.assertEquals("Name:Andrei Maniliuc", name);
    }


    }



