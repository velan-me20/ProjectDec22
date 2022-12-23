import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	driver.get("www.facebook.com");

		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Velan");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("9703376098");
		
		// comment added
	}
}
