package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompanyNew {

	WebDriver driver;
	
	public CompanyNew(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@title='Companies']")
	WebElement companyLink;
	
	@FindBy(xpath = "//a[@title='New Company']")
	WebElement addnewcompanyLink;
	
	@FindBy(id="company_name")
	WebElement companyname;
	
	@FindBy(name="industry")
	WebElement industry;
	
	@FindBy(name="status")
	WebElement status;
	
	@FindBy(name="priority")
	WebElement priority;
	
	@FindBy(id="phone")
	WebElement phonenumber;
	
	@FindBy(xpath="//*[@id=\"companyForm\"]/table/tbody/tr[1]/td/input")
	WebElement Clickonsave;
	
	
	public void clickoncompany()
	{
		driver.switchTo().frame("mainpanel");
		Actions act= new Actions(driver);
		act.moveToElement(companyLink).build().perform();
	}
	
	public void clickonNewcompany()
	{
		addnewcompanyLink.click();
	}
	
	
	public void entercompany(String companynm)
	{
		companyname.sendKeys(companynm);
	}
	
	public void enterindustry(String industrynm)
	{
		industry.sendKeys(industrynm);
	}
	
	public void enterstatus(String Stats)
	{
		Select stat= new Select(status);
		stat.selectByVisibleText(Stats);
	}
	
	public void enterpriority(String prior)
	{
		Select P= new Select(priority);
		P.selectByVisibleText(prior);
	}
	
	public void enterphone(String Pnum)
	{
	phonenumber.sendKeys(Pnum);	
	}
	
	public void clicksave()
	{
		Clickonsave.click();
	}
	
}
