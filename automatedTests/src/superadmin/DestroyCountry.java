package superadmin;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Test to destroy country
 * 
 * @author Madi Vachon
 **/

public class DestroyCountry {
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
	public void test() {
		login();
		driver.get(baseUrl + "/countries");
		driver.findElement(By.xpath("//li[6]/ul/li[5]/div/div/a/i")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Delete')])[6]"))
				.click();
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
     		driver.findElement(By.id("username")).sendKeys("superadmin");
     		driver.findElement(By.id("user_password")).clear();
     		driver.findElement(By.id("user_password")).sendKeys("superadmin");
     		driver.findElement(By.name("commit")).click();
  	}
}
