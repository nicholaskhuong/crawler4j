package com.freakick.dashboard;

import java.util.concurrent.TimeUnit;
import com.freakick.objects.pagedefinitions.LoginPageDefinition;
import com.freakick.utilities.BaseTestCase;
import com.freakick.utilities.Credentials;
import com.freakick.utilities.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
@Credentials(user = "dev.enclave", password = "password@2017")
//@Credentials(user = "iceballos@yahoo.com", password = "password@2017")
@TestData(fileName = "CreateClass.xls")
public class CreateClass extends BaseTestCase {

  @Test(dataProvider="ExcelDataProvider")
  public void Login(String className, String classCode,String classAddress, String startDate,String endDate, String dayPrice,String fullPrice, String duration) throws Exception {
	  	driver.navigate().to(getServerURL() + "/dashboard-branch");
	  	WebElement userNameLogged = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(LoginPageDefinition.LOGGED_NAME)));
		Assert.assertEquals(userNameLogged.getText(),"HI, DEV.ENCLAVE");
		driver.findElement(By.linkText("FACILITIES")).click();
		//Click on Classes link
		WebElement classesLink = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Classes")));
		classesLink.click();
//		driver.findElement(By.linkText("Classes")).click();
		//Create new class
		WebElement createNewClass = driver.findElement(By.linkText("CREATE NEW CLASS")); 
		createNewClass.click();
		driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys(className);
	    driver.findElement(By.id("code")).clear();
	    driver.findElement(By.id("code")).sendKeys(classCode);
	    driver.findElement(By.id("address")).click();
	    driver.findElement(By.id("address")).clear();
	    driver.findElement(By.id("address")).sendKeys(classAddress);
	    driver.findElement(By.id("address")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.id("address")).click();
	    WebElement addressReturn = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Boston, MA, USA")));
	    addressReturn.click();
	    driver.findElement(By.id("user-logo")).sendKeys("C:\\Users\\KhuongDai\\Documents\\449px-Git_data_flow_simplified.svg.png");
	    driver.findElement(By.linkText("AMERICAN FOOTBALL")).click();
	    driver.findElement(By.xpath("//div[3]/div[2]/form/div/div/div/div/div/div/div/a/div")).click();
	    driver.findElement(By.id("time")).click();
	    driver.findElement(By.name("daterangepicker_start")).click();
	    driver.findElement(By.name("daterangepicker_start")).clear();
	    driver.findElement(By.name("daterangepicker_start")).sendKeys("2017-06-23");
	    driver.findElement(By.name("daterangepicker_end")).click();
	    driver.findElement(By.name("daterangepicker_end")).clear();
	    driver.findElement(By.name("daterangepicker_end")).sendKeys("2017-07-22");
	    driver.findElement(By.name("daterangepicker_start")).click();
	    driver.findElement(By.cssSelector("body > div.daterangepicker.dropdown-menu.ltr.show-calendar.opensright > div.ranges > div > button.applyBtn.btn.btn-sm.btn-success")).click();
	    driver.findElement(By.id("dayPrice")).clear();
	    driver.findElement(By.id("dayPrice")).sendKeys(dayPrice);
	    driver.findElement(By.id("fullPrice")).clear();
	    driver.findElement(By.id("fullPrice")).sendKeys(fullPrice);
	    driver.findElement(By.id("duration")).clear();
	    driver.findElement(By.id("duration")).sendKeys(duration);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement saveButton = driver.findElement(By.cssSelector("body > sd-app > sd-branch > frk-single-branch > div > div > div > frk-branch-class > frk-branch-create-class > div > div > div > div.portlet-title > div.actions > button:nth-child(2)"));
	    js.executeScript("arguments[0].click();", saveButton);
	    WebElement classesGrid = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > sd-app > sd-branch > frk-single-branch > div > div > div > frk-branch-class > frk-branch-list-class > div.row > div > bra-branch-list-class > div > div")));
	    Assert.assertEquals(classesGrid.isDisplayed(),true);
  }
}
