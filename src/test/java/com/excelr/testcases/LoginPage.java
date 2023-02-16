package com.excelr.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	public void browserConfig() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory");
	}

	public void fillForm() {
driver.manage().window().maximize();

		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2200)");
		
		
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	By locator = By.xpath("//input[@name='fields[name]']");
	wait1.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	driver.findElement(locator).sendKeys("Shital");
	
	js.executeScript("window.scrollBy(0,2200)");
	By locator1 = By.name("fields[email]");
	wait1.until(ExpectedConditions.visibilityOfElementLocated(locator1));
	
	driver.findElement(locator1).sendKeys("Shital@gmail.com");
	
	
	

		driver.findElement(By.name("fields[phone]")).sendKeys("1234567890");
		WebElement country = driver.findElement(By.name("fields[country]"));
		Select con = new Select(country);
		
		con.selectByValue("Argentina");
		
		WebElement interest = driver.findElement(By.name("fields[what_is_your_interest]"));
		Select intrst = new Select(interest);
		intrst.selectByVisibleText("Web Development");
		
		WebElement budget = driver.findElement(By.name("fields[budget]"));
		Select bug= new Select(budget);
		bug.selectByVisibleText("$25k+");
		
		WebElement require = driver.findElement(By.name("fields[requirement]"));
		Select req = new Select(require);
		req.selectByVisibleText("New Project");
		
		driver.findElement(By.name("fields[message]")).sendKeys("this is my first project");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	
	public  void getAllHeaders() {
		List<WebElement> header = driver.findElements(By.tagName("a"));
		
		for(WebElement head : header)
		{
			System.out.println(head.getText());
		}
	}
	
	public void clickOnProducts() {
		driver.findElement(By.linkText("Work")).click();
		driver.findElement(By.xpath("//a[text()='Work']")).click();
		
		driver.findElement(By.xpath("//span[text()='products']")).click();
		
		
		driver.manage().window().maximize();

	}
}
