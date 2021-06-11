package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002 {

	@Test
	public void testCase1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		Thread.sleep(4000);
		System.out.println("TC002");
		driver.quit();
	}
}
