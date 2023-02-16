package com.excelr.testcases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.excelr.database.GetExcelData;
import com.excelr.pages.ITechNotionPage;

public class ITechNotionPageTest extends GetExcelData  {
	
	
	ITechNotionPage it;
	
	@BeforeMethod
	public void browserConfig() {
		it = new ITechNotionPage();
		it.initialization();
	}

	
	
	@Test
	public void fillForm() {
		it.fillFormDetails();
		
	}
	
	@Test
	public  void getAllHeaders() {
		it.getAllHeaders();
	}
	
	@Test
	public void clickOnProducts() {

		System.out.println(it.getTitle());
	
	
	}
	
	@AfterMethod
	public void closeAllBrowsers()
	{
		it.tearDown();
	}

}
