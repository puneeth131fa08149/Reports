package com.w2a.BaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Snapshot {

	static int no;
	public static File getsnap() {
		WebDriver driver=BaseTest.drivers.get();
		TakesScreenshot takesnap=(TakesScreenshot) driver;
		File tempsnap=takesnap.getScreenshotAs(OutputType.FILE);
		File dest=new File("snapshot/"+(no++)+".png");
		try {
			Files.move(tempsnap, dest);
			return dest;
		} catch (IOException e) {
			System.out.println("error while saving snap");
			e.printStackTrace();
			return null;
		}
	}
}
