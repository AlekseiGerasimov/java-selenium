package example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
    }
    @Test
    public void userLogin() {
        driver.get("http://yandex.ru");
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
