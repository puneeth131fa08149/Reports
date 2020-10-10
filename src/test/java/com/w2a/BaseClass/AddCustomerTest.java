package com.w2a.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddCustomerTest extends BaseTest{
	public WebDriverWait wait;
	int no=1;
	@Test(priority = 1)
	public void addCustomer() throws InterruptedException {
		///Test
		Assert.assertEquals(driver.getTitle(), "PSMS");
		driver.findElement(By.xpath("//input[@id='id_uname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("issi123");
		driver.findElement(By.xpath("//span[contains(text(),'SIGN-IN')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Master']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Client types']")).click();
		driver.findElement(By.xpath("//button[@title=\"Add Record\"]")).click();
		
		driver.findElement(By.xpath("//input[@name='nm_client_type']")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='client_desc']")).sendKeys("QA Automation Tester");
		driver.findElement(By.xpath("//input[@id='radio5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='Delete Record'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}
	@Test(priority = 2)
	public void CustomerPage() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='id_uname']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("issi123");
		driver.findElement(By.xpath("//span[contains(text(),'SIGN-IN')]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}


}
