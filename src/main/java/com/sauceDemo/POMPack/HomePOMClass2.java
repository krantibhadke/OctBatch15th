package com.sauceDemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass2 
{
 WebDriver driver;
 //Actions act;
 //Select s;

@FindBy(xpath="//button[@id='react-burger-menu-btn']")
 WebElement Settingbtn;

public void clickSettingbtn()
{
	//act.click(Settingbtn).perform();
	 Settingbtn.click();
}

@FindBy(xpath="//a[@id='logout_sidebar_link']")
 WebElement LogOutBtn;
public void clickLogOutBtn()
{
	//act.click(LogOutBtn).perform();
	LogOutBtn.click();
}

//dropdown

//@FindBy(xpath="//select[@class='product_sort_container']")
// WebElement Filter;
//public void dropdownFilter()
//{
//	s.selectByValue("az");
//	s.selectByIndex(0);
//	s.selectByVisibleText("Name (A to Z)");
//}

//sort product

@FindBy(xpath="//div[contains(@class,'item_name')]")
 List<WebElement>MultiProduct;

public void MultiProduct()
{
for(int i=0; i<MultiProduct.size();i++)
{
	String z=MultiProduct.get(i).getText();
	System.out.println(z);
}
}

@FindBy(xpath="//button[text()='Add to cart']")
List<WebElement>AllProducts;
public void clickAllProducts()
{
for(WebElement x :AllProducts )
{
	//act.click(x).perform();
	x.click();
}
}


// click on product container

@FindBy(xpath="//span[@class='shopping_cart_badge']")
WebElement shoppingcontainer;

public String shoppingcontainergettext ()
{
   String x=shoppingcontainer.getText() ;
   return x;
}

//click on chkout button

@FindBy(xpath="//button[@id='checkout']")
 WebElement ChkoutBtn;

public void clickChkoutBtn()
{
//act.click(ChkoutBtn).perform();	
	ChkoutBtn.click();
}

//Fname
@FindBy(xpath="//input[@id='first-name']")
 WebElement Fname;

public void sendKeysFname()
{
	Fname.sendKeys("Kranti");
}

//Lname
@FindBy(xpath="//input[@id='last-name']")
 WebElement Lname;

public void sendKeysLname()
{
	Lname.sendKeys("Bhadke");
}


//zip postal code

@FindBy(xpath="//input[@id='postal-code']")
 WebElement ZipCode;

public void sendKeysZipCode()
{
	ZipCode.sendKeys("123456");
}


//Continue button

@FindBy(xpath="//input[@id='continue']")
 WebElement ContinueBtn;

public void clickContinueBtn()
{
//act.click(ContinueBtn).perform();
	ContinueBtn.click();
}

// finishBtn


@FindBy(xpath="//button[@id='finish']")
 WebElement FinishBtn;

public void clickFinishBtn()
{
	//act.click(FinishBtn).perform();
	FinishBtn.click();
}

//back home

@FindBy(xpath="//button[@id='back-to-products']")
 WebElement Backtohome;

public void clickBacktohome()
{
//act.click(Backtohome).perform();	
	Backtohome.click();
}

public HomePOMClass2(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
//act=new Actions(driver);
//s=new Select(Filter);
}















}
