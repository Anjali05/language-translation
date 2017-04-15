package admin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Test for destroying category (admin)
 * @author Madi Vachon
 *
 */

public class DestroyCategory {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:3000/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/categories");
    driver.findElement(By.cssSelector("a.button--icon")).click();
    driver.findElement(By.linkText("Delete")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public void login() {
     driver.get(baseUrl + "/login");
     driver.findElement(By.id("username")).clear();
     driver.findElement(By.id("username")).sendKeys("admin1");
     driver.findElement(By.id("user_password")).clear();
     driver.findElement(By.id("user_password")).sendKeys("admin1");
     driver.findElement(By.name("commit")).click();
  }
}
