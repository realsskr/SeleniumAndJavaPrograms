import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserActionsUsingSearchContext {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		SearchContext driver = new ChromeDriver();
		((WebDriver) driver).get("https://www.google.com/");
		String Country = driver.findElement(By.className("uU7dJb")).getText();
		System.out.println("country= "+Country);
		String exp="India";
		((WebDriver) driver).manage().window().maximize();
		if(Country.equals(exp)) {
			System.out.println("Expected country only");
		}
		((WebDriver) driver).quit();
	}
	
	

}
