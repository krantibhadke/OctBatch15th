package com.sauceDemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMPack.HomePOMClass2;
import com.sauceDemo.UtilityPack.UtilityClass;

public class TC03_VerifyAddtoCartFunctionality extends TestBaseClass
{
	
@Test
public void VerifyAddtoCartFunctionality() throws IOException
{

	HomePOMClass2 a = new HomePOMClass2(driver);

a.clickAllProducts();
System.out.println("click on all product");

UtilityClass.screenshotMethod(driver, "TC02 add to cart");
System.out.println("takes screenshot");

String Expected="6";
String Actual=a.shoppingcontainergettext();

//if(Expected.equals(Actual))
//{
//System.out.println("Add to cart test case is passed");	
//}
//else
//{
//	System.out.println("Add to cart test case is failed");	
//
//}

Assert.assertEquals(Actual, Expected);











}
}
