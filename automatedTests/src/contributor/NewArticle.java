package contributor;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewArticle {
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
    driver.get(baseUrl + "/articles");
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.id("article_picture")).clear();
    driver.findElement(By.id("article_picture")).sendKeys("/home/madi/Downloads/cat.jpg");
    new Select(driver.findElement(By.id("article_category_id"))).selectByVisibleText("Animals");
    driver.findElement(By.id("article_english")).clear();
    driver.findElement(By.id("article_english")).sendKeys("Cat");
    driver.findElement(By.id("article_phonetic")).clear();
    driver.findElement(By.id("article_phonetic")).sendKeys("Cat");
    driver.findElement(By.id("article_audios_attributes_0_content")).clear();
    driver.findElement(By.id("article_audios_attributes_0_content")).sendKeys("Cat");
    driver.findElement(By.id("article_audios_attributes_0_audio")).clear();
    driver.findElement(By.id("article_audios_attributes_0_audio")).sendKeys("/home/madi/Downloads/cat.jpg");
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
     driver.findElement(By.id("username")).sendKeys("contributor");
     driver.findElement(By.id("user_password")).clear();
     driver.findElement(By.id("user_password")).sendKeys("contributor");
     driver.findElement(By.name("commit")).click();
  }
}
