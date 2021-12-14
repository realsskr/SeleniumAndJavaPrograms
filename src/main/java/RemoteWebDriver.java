import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoteWebDriver {
	
	@Test
	public void testMethos() {
		
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
