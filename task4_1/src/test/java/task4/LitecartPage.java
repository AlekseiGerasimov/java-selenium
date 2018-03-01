package task4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class LitecartPage {
    private static WebDriver driver;
    LitecartPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/litecart/admin");
    }

    public void findAndSetValue(String xpath_field,String value){
        driver.findElement(By.xpath(xpath_field)).sendKeys(value);
    }
    public void findAndClick(String xpath_field){
        driver.findElement(By.xpath(xpath_field)).click();
    }
    public void asserted(String expected,String xpath_field){
        Assert.assertEquals(expected,driver.findElement(By.xpath(xpath_field)).getText());
    }

    public void quit(){
        driver.quit();
    }
}
