package com.w2a.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddCustomerTest extends TestBase{
	public WebDriverWait wait;
	int no=1;
	@Test(invocationCount = 3)
	public void addCustomer() throws InterruptedException {
		
		if (no==2) {
			no++;
			Assert.fail("failing test case");
		}
		if (no==5) {
			throw new SkipException("Skipping test case invocation count is 3");
		}
		///Test
		Assert.assertEquals(driver.getTitle(), "PSMS");
		driver.findElement(By.xpath("//input[@id='id_uname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("issi123");
		driver.findElement(By.xpath("//span[contains(text(),'SIGN-IN')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='User Actions'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	
	
	}


}
