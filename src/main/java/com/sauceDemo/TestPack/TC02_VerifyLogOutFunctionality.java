package com.sauceDemo.TestPack;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPack.HomePOMClass2;



public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
@Test
public void VerifyLogOutFunctionality()
{
	
	HomePOMClass2 y = new HomePOMClass2(driver);

y.clickSettingbtn();;
System.out.println("Click on setting button");

y.clickLogOutBtn();;
System.out.println("Click on Logout button");

String expected="https://www.saucedemo.com/";
System.out.println(expected);
String actual=driver.getCurrentUrl();
System.out.println(actual);

//if(expected.equals(actual))
//{
//System.out.println("Logout test case is passed");	
//}
//else
//{
//	System.out.println("Logout test case is failed");	
//	
//}

Assert.assertEquals(actual, expected);

}
}
