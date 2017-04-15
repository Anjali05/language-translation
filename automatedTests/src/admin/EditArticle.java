package admin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Test for editing articles (admin)
 * @author Madi Vachon
 *
 */

public class EditArticle {
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:3000/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    login();
    driver.get(baseUrl + "/articles");
    driver.findElement(By.cssSelector("i.icon-action")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("article_picture")).clear();
    driver.findElement(By.id("article_picture")).sendKeys("/home/madi/Downloads/cat.jpg");
    new Select(driver.findElement(By.id("article_language_id"))).selectByVisibleText("Pohnpeian");
    new Select(driver.findElement(By.id("article_category_id"))).selectByVisibleText("Insects");
    driver.findElement(By.id("article_english")).clear();
    driver.findElement(By.id("article_english")).sendKeys("cat");
    driver.findElement(By.id("article_phonetic")).clear();
    driver.findElement(By.id("article_phonetic")).sendKeys("cat");
    driver.findElement(By.id("article_audios_attributes_0_content")).clear();
    driver.findElement(By.id("article_audios_attributes_0_content")).sendKeys("cat");
    driver.findElement(By.id("article_audios_attributes_0_audio")).clear();
    driver.findElement(By.id("article_audios_attributes_0_audio")).sendKeys("/home/madi/Downloads/cat.jpg");
    driver.findElement(By.cssSelector("button.button.button--primary")).click();
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
