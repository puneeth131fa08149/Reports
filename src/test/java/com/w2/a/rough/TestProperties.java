package com.w2.a.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties config=new Properties();
		Properties or=new Properties();
		FileInputStream fls=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		config.load(fls);

		fls=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\or.properties");
		or.load(fls);

		System.out.println(config.getProperty("browser"));
		System.out.println(or.getProperty("BankManagerLogin"));
	}
}
