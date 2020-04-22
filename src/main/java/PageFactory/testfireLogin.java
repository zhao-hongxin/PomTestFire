package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testfireLogin {
	
	WebDriver driver;
	@FindBy(name="uid")
	WebElement userTestfireName;
	
	@FindBy(name="passw")
	WebElement passwordTestfire;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]/div/h1")
	WebElement titleText;
	
	@FindBy(name="btnSubmit")
	WebElement login;
	
	public testfireLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUserName){
		userTestfireName.sendKeys(strUserName);
	}
		
	public void setPassword(String strPassword){
		passwordTestfire.sendKeys(strPassword);
	}
		
	public void clickLogin(){
		login.click();
	}
		
	public String getLoginTitle(){
		return	titleText.getText();
	}
	
	public void loginToTestfire(String strUserName,String strPasword) {
		this.setUserName(strUserName);;
		this.setPassword(strPasword);
		this.clickLogin();
	}
	
}
