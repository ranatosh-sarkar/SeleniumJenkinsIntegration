package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {

	@Test
	public void testCase1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\1.Testing\\SeleniumJenkins\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		Thread.sleep(4000);
		System.out.println("TC003");
		driver.quit();
	}
}
