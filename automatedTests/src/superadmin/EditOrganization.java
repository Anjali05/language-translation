package superadmin;

import java.util.concurrent.TimeUnit;

import commons.CommonCode;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Test to edit organization
 * 
 * @author Madi Vachon
 **/

public class EditOrganization extends CommonCode {
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
		driver.findElement(By.xpath("//li[5]/ul/li[3]/div/div/a/i")).click();
		driver.findElement(
				By.cssSelector("div.dropdown.open > ul.dropdown-menu.u-rightPopup > li > a"))
				.click();
		driver.findElement(By.id("organization_name")).clear();
		driver.findElement(By.id("organization_name")).sendKeys("Test2");
		driver.findElement(By.cssSelector("button.button.button--primary"))
				.click();
		driver.findElement(By.linkText("Back")).click();
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
