package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.testfireHomePage;
import PageFactory.testfireLogin;

public class testfireLoginWithPageFactory {
	
	WebDriver driver;
	testfireLogin objLogin;
	testfireHomePage objHomePage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.get("http://www.testfire.net/login.jsp");
	}

	@Test
	public void test() {
		objLogin=new testfireLogin(driver);
		String loginPageTitle=objLogin.getLoginTitle();
		Assert.assertEquals("online banking login",loginPageTitle.toLowerCase());
		objLogin.loginToTestfire("admin", "admin");
		objHomePage=new testfireHomePage(driver);
		Assert.assertEquals("congratulations!",objHomePage.getHomePageDashboardUserName().toLowerCase());
	}
	
	@After
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();		
	}

}
