package com.sauceDemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
   @Test
	public void LoginFunctionality() 
{

String expectedTitle="Swag Labs";

String actualTitle=driver.getTitle();

//if(expectedTitle.equals(actualTitle))
//{
//System.out.println("Login Test Case is Passed");	
//}
//else
//{
//	System.out.println("Login Test Case is failed");	
//	
//}

Assert.assertEquals(actualTitle, expectedTitle);




}
}
