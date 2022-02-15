package TestCase;

import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import Pagelayer.Home_Page;







public class LogInPageNew extends BaseClass {



@FindBy(xpath="//input[@name='uid']")



WebElement Username;

@FindBy(xpath="//input[@name='password']")



WebElement Password;

@FindBy(xpath="//input[@name='btnLogin']")



WebElement Loginbtn;

//Initializing the Page Objects:
public LogInPageNew() throws IOException {
PageFactory.initElements(driver, this);
}

//Action - validate Login and action on Elements
public Home_Page login22(String un, String pwd) throws IOException{
/*
* Performing actions on identified objects
*/
Username.sendKeys(un);
Password.sendKeys(pwd);
Loginbtn.click();
//LoginButton.click();
return new Home_Page();
}
	
	}

