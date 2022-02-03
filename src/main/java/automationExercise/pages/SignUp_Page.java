package automationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignUp_Page {
	//Variables
	private WebDriver driver;
	private String url="https://www.automationexercise.com/login";
	
	//Element Locators
	//private By Name_TextField=By.name("name");
	//private By Name_TextField=By.xpath("//input[@data-qa='signup-name']");
	//private By Email_TextField=By.name("email");
	//private By Email_TextField=By.xpath("//input[@data-qa='signup-email']");
	private By SignUp_button=By.xpath("//button[@data-qa='signup-button']");
	//constructors
	public SignUp_Page(WebDriver driver) {
		this.driver=driver;
	}
	public void goToSignUpPage() {
		driver.get(url);
	}
	//Actions/Steps
	public void SignUp(String Name,String Email) {
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(Email);
		driver.findElement(SignUp_button).sendKeys(Keys.ENTER);
		
		
	}

}
