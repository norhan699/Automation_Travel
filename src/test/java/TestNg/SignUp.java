package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/signup/ncr");
	}
	@AfterClass
	public void TearDown() {
		//driver.quit();
		//a7sn mn close()
	}
  @Test
  public void SignUp() {
	  //driver.get("https://phptravels.net/signup/ncr");
	  driver.findElement(By.name("first_name")).sendKeys("Norhan",Keys.ARROW_DOWN);
	  driver.findElement(By.name("last_name")).sendKeys("Medhat",Keys.ARROW_DOWN);
	  driver.findElement(By.name("phone")).sendKeys("01100279767",Keys.ARROW_DOWN);
	  driver.findElement(By.name("email")).sendKeys("nonozxp@gmail.com",Keys.ARROW_DOWN);
	  driver.findElement(By.name("password")).sendKeys("njkdFHJNKJ522**",Keys.ARROW_DOWN);
	  driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).sendKeys(Keys.ENTER);
  }
}
