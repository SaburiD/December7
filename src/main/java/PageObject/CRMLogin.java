package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLogin {

WebDriver driver;

public CRMLogin(WebDriver driver) {

this.driver=driver;

PageFactory.initElements(driver, this);
}

@FindBy(name="username")
WebElement usn;

@FindBy(name="password")
WebElement pass;

@FindBy(xpath="//input[@value='Login']")
WebElement clickonlogin;

@FindBy(xpath="//i[@class='fa fa-sign-out icon-2x']")
WebElement clickonlogout;

public void enterusn(String usernm)
{
	usn.sendKeys(usernm);
}
public void enterpass(String paswd )
{
pass.sendKeys(paswd);
}

public void clicklogin()
{
	clickonlogin.click();
}

public void clicklogout()
{
	driver.switchTo().frame("mainpanel");	
	
	clickonlogout.click();
}
}


