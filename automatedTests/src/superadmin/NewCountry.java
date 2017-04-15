package superadmin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Test to create new country
 * 
 * @author Madi Vachon
 **/

public class NewCountry {
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
		driver.get(baseUrl + "/organizations");
		driver.findElement(By.linkText("Countries")).click();
		driver.findElement(By.cssSelector("i.icon-plus")).click();
		new Select(driver.findElement(By.id("country_organization_id")))
				.selectByVisibleText("Red Cross");
		driver.findElement(By.id("country_name")).clear();
		driver.findElement(By.id("country_name")).sendKeys("Test");
		new Select(driver.findElement(By.id("country_user_id")))
				.selectByVisibleText("superadmin");
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
