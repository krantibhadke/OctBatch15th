package com.sauceDemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass
{
	
 WebDriver driver;
 //Actions act;


@FindBy(xpath="//input[@id='user-name']")
 WebElement username;

public void sendUsername()
{
	username.sendKeys("standard_user");
}

@FindBy(xpath="//input[@id='password']")
 WebElement password;
public void sendPassword()
{
password.sendKeys("secret_sauce");	
}

@FindBy(xpath="//input[@id='login-button']")
 WebElement loginbtn;

public void clickLoginbtn()
{
//act.click(loginbtn)	.perform();
	loginbtn.click();
}

public LoginPOMClass(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);

//act=new Actions(driver);
}







}
