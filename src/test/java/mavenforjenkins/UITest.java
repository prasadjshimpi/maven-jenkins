package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Test
	public void sampleUITest() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demoqa.com/");

		Assert.assertEquals(driver.getTitle(), "DEMOQA", "Title does not matched !");
		
		System.out.println("Test Complete");
		
		driver.quit();

	}

}
