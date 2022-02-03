package automationExercise.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationExercise.pages.HomePage;
import automationExercise.pages.SignUp_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExerciseSignUp {
	WebDriver driver;
	HomePage homePage;
	SignUp_Page signUpPage;
	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		homePage=new HomePage(driver);
		
		signUpPage=new SignUp_Page(driver);
		
	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
		//a7sn mn close()
	}
  @Test
  public void navigateToSignUpPage() {
	  homePage.goToMainPage();
	  homePage.goToSignUpPage();
  }
  /*@Test(priority = 2)
  public void navigateToSignUpPage2() {
	  signUpPage.goToSignUpPage();
  }*/
  @Test(dependsOnMethods = "navigateToSignUpPage")
  public void SignUpNow() {
	  signUpPage.SignUp("Norhan", "norhanmedhat123@gmail.com");
  }
}
