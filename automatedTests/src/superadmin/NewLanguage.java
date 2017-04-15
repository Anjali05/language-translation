package superadmin;

import java.util.concurrent.TimeUnit;
import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Test to create new language
 * 
 * @author Madi Vachon
 **/

public class NewLanguage extends CommonCode {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:3000/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		login();
		driver.get(baseUrl + "/sites");
		driver.findElement(By.linkText("Languages")).click();
		driver.findElement(By.cssSelector("i.icon-plus")).click();
		driver.findElement(By.id("language_name")).clear();
		driver.findElement(By.id("language_name")).sendKeys("Test");
		driver.findElement(By.cssSelector("button.button.button--primary"))
				.click();
	}

	public void login() {
                driver.get(baseUrl + "/login");
                driver.findElement(By.id("username")).clear();
                driver.findElement(By.id("username")).sendKeys("superadmin");
                driver.findElement(By.id("user_password")).clear();
                driver.findElement(By.id("user_password")).sendKeys("superadmin");
                driver.findElement(By.name("commit")).click();
        }
}
