package com.ado.pipeline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BankGuru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jamilz\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get("http://demo.guru99.com/V4/");
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		wd.findElement(By.name("uid")).sendKeys("abcdg");
		wd.findElement(By.name("password")).sendKeys("hsds");
		wd.findElement(By.name("btnLogin")).click();
		
		wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		wd.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		wd.close();
	}

}
