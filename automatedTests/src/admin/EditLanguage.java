package admin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Test for editing languages (admin)
 * @author Madi Vachon
 *
 */

public class EditLanguage {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:3000/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    login();
    driver.get(baseUrl + "/languages");
    driver.findElement(By.xpath("(//a[contains(@href, '#')])[4]")).click();
    driver.findElement(By.cssSelector("div.dropdown.open > ul.dropdown-menu.u-rightPopup > li > a")).click();
    driver.findElement(By.id("language_name")).clear();
    driver.findElement(By.id("language_name")).sendKeys("Test2");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
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
