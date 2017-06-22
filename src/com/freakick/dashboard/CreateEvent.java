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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//@Credentials(user = "dev.enclave", password = "password@2017")
@Credentials(user = "iceballos@yahoo.com", password = "password@2017")
@TestData(fileName = "CreateEvent.xls")
public class CreateEvent extends BaseTestCase {

  @Test(dataProvider="ExcelDataProvider")
  public void Login(String className, String classCode,String classAddress, String startDate,String endDate, String dayPrice,String fullPrice, String duration) throws Exception {
	  	WebElement userNameLogged = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(LoginPageDefinition.LOGGED_NAME)));
		Assert.assertEquals(userNameLogged.getText(),"HI, ISABELLA");
		driver.findElement(By.linkText("FACILITIES")).click();
		//Click on Classes link
		WebElement eventLink = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Events")));
		eventLink.click();
//	    driver.findElement(By.linkText("Events")).click();
	    driver.findElement(By.xpath("//ol/a/span")).click();
	    driver.findElement(By.cssSelector("input.form-control.ui-select-search")).click();
	    driver.findElement(By.cssSelector("a.dropdown-item > div")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.cssSelector("input.form-control.ui-select-search")).click();
	    driver.findElement(By.cssSelector("a.dropdown-item > div")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("TestEvent");
	    driver.findElement(By.cssSelector("body > sd-app > sd-branch > frk-single-branch > div > div > div > sd-event > sd-create-event > div.portlet.light.grey-cararra > div.portlet-body.form > div:nth-child(3) > form > div:nth-child(5) > div > ckeditor > textarea")).sendKeys("DesEvent");
	    driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\KhuongDai\\Documents\\449px-Git_data_flow_simplified.svg.png");
	    driver.findElement(By.id("ticketPrice")).click();
	    driver.findElement(By.id("ticketPrice")).clear();
	    driver.findElement(By.id("ticketPrice")).sendKeys("10");
	    driver.findElement(By.id("capacity")).click();
	    driver.findElement(By.id("capacity")).clear();
	    driver.findElement(By.id("capacity")).sendKeys("100");
	    driver.findElement(By.id("send")).click();
	    driver.findElement(By.id("contactEmail")).click();
	    driver.findElement(By.id("contactEmail")).clear();
	    driver.findElement(By.id("contactEmail")).sendKeys("nick@enclave.vn");
	    driver.findElement(By.id("contactPhone")).clear();
	    driver.findElement(By.id("contactPhone")).sendKeys("0123456789");
	    driver.findElement(By.id("address")).click();
	    driver.findElement(By.id("pac-input-1498111636671")).click();
	    driver.findElement(By.id("pac-input-1498111636671")).clear();
	    driver.findElement(By.id("pac-input-1498111636671")).sendKeys("Boston, MA, United States");
	    driver.findElement(By.id("pac-input-1498111636671")).clear();
	    driver.findElement(By.id("pac-input-1498111636671")).sendKeys("Boston, MA 02203, USA");
	    driver.findElement(By.xpath("(//button[@id='send'])[2]")).click();
	    driver.findElement(By.id("startDate")).click();
	    driver.findElement(By.id("endDateType")).click();
	    driver.findElement(By.id("endDateType")).click();
	    driver.findElement(By.id("isAllDateEvent")).click();
	    driver.findElement(By.cssSelector("option[value=\"false\"]")).click();
	    driver.findElement(By.id("startTime")).click();
	    driver.findElement(By.id("startDate")).click();
	    driver.findElement(By.id("isAllDateEvent")).click();
	    driver.findElement(By.xpath("//div[5]/form/div[5]/label")).click();
	    driver.findElement(By.id("startTime")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-up")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.xpath("//tr[3]/td[3]/a/span")).click();
	    driver.findElement(By.xpath("//tr[3]/td[3]/a/span")).click();
	    driver.findElement(By.xpath("//td[3]/a/span")).click();
	    driver.findElement(By.id("endTime")).click();
	    driver.findElement(By.xpath("//tr[3]/td[3]/a/span")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-down")).click();
	    driver.findElement(By.xpath("//tr[3]/td[3]/a/span")).click();
	    driver.findElement(By.xpath("//tr[3]/td[3]/a/span")).click();
	    driver.findElement(By.xpath("//tr[3]/td[3]/a/span")).click();
	    driver.findElement(By.id("endTime")).click();
	    driver.findElement(By.xpath("//div[5]/form/div[8]/div")).click();
	    driver.findElement(By.id("endTime")).click();
	    driver.findElement(By.xpath("//div[5]/form/div[8]/div")).click();
	    driver.findElement(By.xpath("(//button[@id='send'])[3]")).click();
	    driver.findElement(By.id("repeatType")).click();
	    driver.findElement(By.cssSelector("option[value=\"0\"]")).click();
	    driver.findElement(By.id("canGuestModify")).click();
	    driver.findElement(By.cssSelector("#canGuestModify > option[value=\"false\"]")).click();
	    driver.findElement(By.id("canGuestSeeGuest")).click();
	    new Select(driver.findElement(By.id("canGuestSeeGuest"))).selectByVisibleText("Yes");
	    driver.findElement(By.cssSelector("#canGuestSeeGuest > option[value=\"true\"]")).click();
	    driver.findElement(By.id("canGuestInviteOthers")).click();
	    driver.findElement(By.cssSelector("#canGuestInviteOthers > option[value=\"false\"]")).click();
	    driver.findElement(By.id("notificationBy")).click();
	    new Select(driver.findElement(By.id("notificationBy"))).selectByVisibleText("Email");
	    driver.findElement(By.cssSelector("#notificationBy > option[value=\"2\"]")).click();
	    driver.findElement(By.id("notificationBeforeHours")).click();
	    driver.findElement(By.id("notificationBeforeHours")).click();
	    driver.findElement(By.id("notificationBeforeHours")).clear();
	    driver.findElement(By.id("notificationBeforeHours")).sendKeys("1");
	    driver.findElement(By.xpath("(//button[@id='send'])[4]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
////		driver.findElement(By.linkText("Events")).click();
//		//Create new class
//		WebElement createNewEvent = driver.findElement(By.linkText("CREATE NEW EVENT")); 
//		createNewEvent.click();
//		driver.findElement(By.id("name")).clear();
//	    driver.findElement(By.id("name")).sendKeys(className);
//	    driver.findElement(By.id("code")).clear();
//	    driver.findElement(By.id("code")).sendKeys(classCode);
//	    driver.findElement(By.id("address")).click();
//	    driver.findElement(By.id("address")).clear();
//	    driver.findElement(By.id("address")).sendKeys(classAddress);
//	    driver.findElement(By.id("address")).click();
//	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	    driver.findElement(By.id("address")).click();
//	    WebElement addressReturn = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Boston, MA, USA")));
//	    addressReturn.click();
//	    driver.findElement(By.id("user-logo")).sendKeys("C:\\Users\\KhuongDai\\Documents\\449px-Git_data_flow_simplified.svg.png");
//	    driver.findElement(By.linkText("AMERICAN FOOTBALL")).click();
//	    driver.findElement(By.xpath("//div[3]/div[2]/form/div/div/div/div/div/div/div/a/div")).click();
//	    driver.findElement(By.id("time")).click();
//	    driver.findElement(By.name("daterangepicker_start")).click();
//	    driver.findElement(By.name("daterangepicker_start")).clear();
//	    driver.findElement(By.name("daterangepicker_start")).sendKeys("2017-06-23");
//	    driver.findElement(By.name("daterangepicker_end")).click();
//	    driver.findElement(By.name("daterangepicker_end")).clear();
//	    driver.findElement(By.name("daterangepicker_end")).sendKeys("2017-07-22");
//	    driver.findElement(By.name("daterangepicker_start")).click();
//	    driver.findElement(By.cssSelector("body > div.daterangepicker.dropdown-menu.ltr.show-calendar.opensright > div.ranges > div > button.applyBtn.btn.btn-sm.btn-success")).click();
//	    
//	    driver.findElement(By.id("dayPrice")).clear();
//	    driver.findElement(By.id("dayPrice")).sendKeys(dayPrice);
//	    driver.findElement(By.id("fullPrice")).clear();
//	    driver.findElement(By.id("fullPrice")).sendKeys(fullPrice);
//	    driver.findElement(By.id("duration")).clear();
//	    driver.findElement(By.id("duration")).sendKeys(duration);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//	    WebElement saveButton = driver.findElement(By.cssSelector("body > sd-app > sd-branch > frk-single-branch > div > div > div > frk-branch-class > frk-branch-create-class > div > div > div > div.portlet-title > div.actions > button:nth-child(2)"));
//	    js.executeScript("arguments[0].click();", saveButton);
//	    WebElement classesGrid = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > sd-app > sd-branch > frk-single-branch > div > div > div > frk-branch-class > frk-branch-list-class > div.row > div > bra-branch-list-class > div > div")));
//	    Assert.assertEquals(classesGrid.isDisplayed(),true);
//		
  }
}
