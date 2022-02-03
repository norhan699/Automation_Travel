package automationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	private String url="https://www.automationexercise.com";
	//element locators
	private By SignUpLink=	By.xpath("//a[@href='/login']");
	
	//constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Actions
	public void goToMainPage() {
		driver.get(url);
	}
	public void goToSignUpPage() {
		driver.findElement(SignUpLink).click();
	}

}
