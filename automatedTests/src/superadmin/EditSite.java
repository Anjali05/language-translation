package superadmin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Test to edit site
 * 
 * @author Madi Vachon
 **/

public class EditSite {
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
		driver.findElement(By.cssSelector("i.icon-action")).click();
		driver.findElement(By.linkText("Edit")).click();
		new Select(driver.findElement(By.id("site_country_id")))
				.selectByVisibleText("Haiti");
		driver.findElement(By.id("site_name")).clear();
		driver.findElement(By.id("site_name")).sendKeys("Test2");
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
