package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.CRMLogin;
import PageObject.CompanyNew;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
	public WebDriver driver;
	public CRMLogin crm;
	public CompanyNew Acom;
	
	@Given("User Launch the Browser")
	public void user_launch_the_browser() {
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		crm= new CRMLogin(driver);
		Acom= new CompanyNew(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
	
		driver.get(url);
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String User, String Passwrd) {
	
		crm.enterusn(User);
		crm.enterpass(Passwrd);
	}

	@When("click on Login buton")
	public void click_on_login_buton() throws InterruptedException {
	
		crm.clicklogin();
	}

	@Then("title page should be {string}")
	public void title_page_should_be(String expectedtitle) {
	String actualtitle=driver.getTitle();
	
	if(expectedtitle.equals(actualtitle))
	{
		Assert.assertTrue(true);//pass
	}
	else {
		Assert.assertTrue(false);//fail
	}
	}

	@When("user click on Logout button")
	public void user_click_on_logout_button() throws InterruptedException {
	   crm.clicklogout();
	}
	
	@Then("close browser")
	public void close_browser() {
	
		driver.quit();
	}

	/////////////////////ADD NEW COMPANY///////////////////////
	

	@When("user clicks on comapnay menu")
	public void user_clicks_on_comapnay_menu() {
	    Acom.clickoncompany();
	}

	@When("click on New Company")
	public void click_on_new_company() {
	Acom.clickonNewcompany();
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	Acom.entercompany("Smartcoding");
	Acom.enterindustry("Computer IT");
	Acom.enterstatus("New");
	Acom.enterpriority("High");
	Acom.enterphone("8898877678");
	}

	@When("click on Save button")
	public void click_on_save_button() {
	Acom.clicksave();
	}

	
	
	
}
