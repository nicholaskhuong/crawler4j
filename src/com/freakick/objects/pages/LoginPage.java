package com.freakick.objects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.freakick.objects.pagedefinitions.LoginPageDefinition;
import com.freakick.utilities.InputController;
import com.freakick.utilities.TestLoginCredentials;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage() {
		super(BasePage.driver);
	}
	
	public void login(String url,String username, String password){
		driver.navigate().to(url);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement getFreakickButton = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id(LoginPageDefinition.GET_FREAKICK_BUTTON)));
		WebElement secretCodeTextField = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id(LoginPageDefinition.SECRET_CODE_TEXT_FIELD_ID)));
		secretCodeTextField.clear();
		secretCodeTextField.sendKeys("enclave.cooldevs");
		getFreakickButton.click();
	    WebElement loginLink = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Login")));
	    loginLink.click();
	    WebElement userNameTextField = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.name(LoginPageDefinition.USERNAME_TEXT_FIELD_ID)));
		InputController.inputToTextFiled(userNameTextField, username);
		InputController.inputToTextFiled(getPasswordTextField(), password);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	}
	
	public void login(String url,TestLoginCredentials credential){
		login(url,credential.getUsername(), credential.getPassword());
	}
	// Get ELELEMENTS
	
	public static WebElement getUsernameTextField(){
		return driver.findElement(By.name(LoginPageDefinition.USERNAME_TEXT_FIELD_ID));
	}
	
	public static WebElement getPasswordTextField(){
		return driver.findElement(By.name(LoginPageDefinition.PASSWORD_TEXT_FIELD_ID));
	}
}
