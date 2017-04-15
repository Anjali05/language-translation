package superadmin;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Test to create new organization
 * 
 * @author Madi Vachon
 **/

public class NewOrganization extends CommonCode {
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
		driver.get(baseUrl + "/articles/2");
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("i.icon-plus")).click();
		driver.findElement(By.id("organization_name")).clear();
		driver.findElement(By.id("organization_name")).sendKeys("Test");
		driver.findElement(By.cssSelector("button.button.button--primary"))
				.click();
		driver.findElement(By.cssSelector("span.icon-chevron-left-thin"))
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
